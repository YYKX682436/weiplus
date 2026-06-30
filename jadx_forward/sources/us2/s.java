package us2;

/* loaded from: classes2.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f512071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f512072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f512073f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f512074g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f512075h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.lang.String str, int i17, int i18, boolean z17, boolean z18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f512071d = str;
        this.f512072e = i17;
        this.f512073f = i18;
        this.f512074g = z17;
        this.f512075h = z18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new us2.s(this.f512071d, this.f512072e, this.f512073f, this.f512074g, this.f512075h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((us2.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.Object obj2 = us2.u.f512083c;
        java.lang.String str = this.f512071d;
        int i17 = this.f512072e;
        int i18 = this.f512073f;
        boolean z17 = this.f512074g;
        boolean z18 = this.f512075h;
        synchronized (obj2) {
            java.util.Map map = us2.u.f512084d;
            if (((p3325xe03a0797.p3326xc267989b.r2) ((java.util.LinkedHashMap) map).get(str)) != null) {
                return jz5.f0.f384359a;
            }
            map.put(str, p3325xe03a0797.p3326xc267989b.l.d(us2.u.f512081a.i(), null, null, new us2.r(str, i17, i18, z17, z18, null), 3, null));
            return jz5.f0.f384359a;
        }
    }
}
