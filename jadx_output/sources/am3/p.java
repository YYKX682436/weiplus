package am3;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f8795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ am3.s f8796e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String str, am3.s sVar) {
        super(0);
        this.f8795d = str;
        this.f8796e = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList;
        java.lang.String str = gm0.j1.u().d() + "music/cover/";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.u().d() + "music/cover/");
        sb6.append("mv_app_icon/");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.vfs.w6.f(sb7);
        int Q = com.tencent.mm.vfs.w6.Q(this.f8795d, str);
        java.lang.String str2 = this.f8796e.f8801d;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("handleAppIconZip ");
        sb8.append(Q);
        sb8.append(' ');
        sb8.append(com.tencent.mm.vfs.w6.j(sb7));
        sb8.append(' ');
        java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(sb7, false);
        if (s17 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(s17, 10));
            java.util.Iterator it = s17.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.tencent.mm.vfs.x1) it.next()).f213231a);
            }
        } else {
            arrayList = null;
        }
        sb8.append(arrayList);
        com.tencent.mars.xlog.Log.i(str2, sb8.toString());
        return jz5.f0.f302826a;
    }
}
