package zv1;

/* loaded from: classes5.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f557836d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(int i17) {
        super(4);
        this.f557836d = i17;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        com.p314xaae8f345.mm.vfs.x1 m17;
        java.lang.String fsName = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        java.util.Map accEnv = (java.util.Map) obj3;
        java.lang.String path = (java.lang.String) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fsName, "fsName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(accEnv, "accEnv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if ((intValue & 4095) != this.f557836d) {
            return java.lang.Boolean.FALSE;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(path);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        return java.lang.Boolean.valueOf(aw1.c0.a(intValue, m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null && m17.f294769f) >= 1);
    }
}
