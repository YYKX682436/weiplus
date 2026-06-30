package am3;

/* loaded from: classes.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ am3.s f90329e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String str, am3.s sVar) {
        super(0);
        this.f90328d = str;
        this.f90329e = sVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.ArrayList arrayList;
        java.lang.String str = gm0.j1.u().d() + "music/cover/";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.u().d() + "music/cover/");
        sb6.append("mv_app_icon/");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.vfs.w6.f(sb7);
        int Q = com.p314xaae8f345.mm.vfs.w6.Q(this.f90328d, str);
        java.lang.String str2 = this.f90329e.f90334d;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("handleAppIconZip ");
        sb8.append(Q);
        sb8.append(' ');
        sb8.append(com.p314xaae8f345.mm.vfs.w6.j(sb7));
        sb8.append(' ');
        java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(sb7, false);
        if (s17 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(s17, 10));
            java.util.Iterator it = s17.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.p314xaae8f345.mm.vfs.x1) it.next()).f294764a);
            }
        } else {
            arrayList = null;
        }
        sb8.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb8.toString());
        return jz5.f0.f384359a;
    }
}
