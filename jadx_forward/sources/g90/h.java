package g90;

/* loaded from: classes3.dex */
public final class h implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g90.s f351223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f351224b;

    public h(g90.s sVar, yz5.l lVar) {
        this.f351223a = sVar;
        this.f351224b = lVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.util.Map map;
        jz5.l[] lVarArr = new jz5.l[4];
        g90.s sVar = this.f351223a;
        lVarArr[0] = new jz5.l("view_type", java.lang.Integer.valueOf(sVar.f351289g));
        lVarArr[1] = new jz5.l("image_quality_type", java.lang.Integer.valueOf(((java.lang.Boolean) g90.s.wi(sVar, sVar.f351288f).f384367e).booleanValue() ? 1 : 2));
        lVarArr[2] = new jz5.l("pic_video_open_type", java.lang.Integer.valueOf(sVar.f351291i));
        lVarArr[3] = new jz5.l("pic_video_exit_type", java.lang.Integer.valueOf(sVar.f351290h));
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        i17.putAll(sVar.Ni(sVar.f351288f));
        yz5.l lVar = this.f351224b;
        if (lVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            map = (java.util.Map) lVar.mo146xb9724478(str);
        } else {
            map = null;
        }
        bm5.j0.a(i17, map);
        return i17;
    }
}
