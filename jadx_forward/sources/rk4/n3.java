package rk4;

/* loaded from: classes11.dex */
public final class n3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ll4.c f478390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rk4.q3 f478391e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478392f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478393g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f478394h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(ll4.c cVar, rk4.q3 q3Var, java.lang.String str, java.lang.String str2, yz5.l lVar) {
        super(0);
        this.f478390d = cVar;
        this.f478391e = q3Var;
        this.f478392f = str;
        this.f478393g = str2;
        this.f478394h = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        rk4.q3 q3Var = this.f478391e;
        ll4.c cVar = this.f478390d;
        if (cVar != null) {
            com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25045x5b70b0b9 c25045x5b70b0b9 = q3Var.f478464h;
            java.lang.String str2 = q3Var.f478466m;
            if (c25045x5b70b0b9 == null) {
                rk4.k5.d("prepared, " + cVar + ", but api not ready, plugin:" + cVar.hashCode(), str2);
            } else {
                int mo145968x9f1bbe0b = cVar.mo145968x9f1bbe0b();
                int mo145967x2a8d0982 = cVar.mo145967x2a8d0982();
                rk4.k5.e("prepared, plugin:" + cVar.hashCode() + ", " + cVar + ", width:" + mo145968x9f1bbe0b + ", height:" + mo145967x2a8d0982, str2);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str3 = this.f478392f;
                sb6.append(str3);
                sb6.append('_');
                java.lang.String str4 = this.f478393g;
                sb6.append(str4);
                java.lang.String sb7 = sb6.toString();
                java.util.HashMap hashMap = q3Var.f478460d;
                java.lang.Object obj = hashMap.get(sb7);
                boolean z17 = obj == null;
                if (z17) {
                    rk4.k5.e("creating new SurfaceProducer for key=" + sb7 + ", plugin:" + cVar.hashCode(), str2);
                    io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 interfaceC28980x1159d658 = q3Var.f478463g;
                    obj = interfaceC28980x1159d658 != null ? interfaceC28980x1159d658.m139631xfdf2a2c3() : null;
                    str = str3;
                } else {
                    str = str3;
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("reusing existing SurfaceProducer for key=");
                    sb8.append(sb7);
                    sb8.append(", entryId:");
                    io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = (io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer) obj;
                    sb8.append(surfaceProducer != null ? java.lang.Long.valueOf(surfaceProducer.id()) : null);
                    sb8.append(", plugin:");
                    sb8.append(cVar.hashCode());
                    rk4.k5.e(sb8.toString(), str2);
                }
                io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer2 = (io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer) obj;
                if (surfaceProducer2 != null) {
                    hashMap.put(sb7, obj);
                    surfaceProducer2.mo138098x76500f83(mo145968x9f1bbe0b, mo145967x2a8d0982);
                    cVar.mo145966x42c875eb(surfaceProducer2.mo138084xcf572877());
                    com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25184x7851347b c25184x7851347b = new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25184x7851347b(java.lang.Long.valueOf(surfaceProducer2.id()), java.lang.Long.valueOf(mo145968x9f1bbe0b), java.lang.Long.valueOf(mo145967x2a8d0982));
                    this.f478394h.mo146xb9724478(c25184x7851347b);
                    rk4.k5.e("TextureInfo created: plugin:" + surfaceProducer2.hashCode() + ", textureId:" + c25184x7851347b.m93176xc2ca74e0() + ", width:" + c25184x7851347b.m93177x6dff3e1() + ", height:" + c25184x7851347b.m93175xbb4f8e6c() + ", isNewEntry:" + z17 + ", sending onTextureUpdate", str2);
                    com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25045x5b70b0b9 c25045x5b70b0b92 = q3Var.f478464h;
                    if (c25045x5b70b0b92 != null) {
                        c25045x5b70b0b92.m92851x47c65e25(str, str4, c25184x7851347b, rk4.m3.f478376d);
                    }
                } else {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder("createOnPrepared onPrepared, entry is null, textureRegistry=");
                    sb9.append(q3Var.f478463g != null);
                    sb9.append(", plugin:");
                    sb9.append(cVar.hashCode());
                    rk4.k5.e(sb9.toString(), str2);
                }
            }
        } else {
            rk4.k5.e("createOnPrepared: onPrepared called with null handler, plugin:" + q3Var.hashCode(), q3Var.f478466m);
        }
        return jz5.f0.f384359a;
    }
}
