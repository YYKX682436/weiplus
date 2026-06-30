package p3380x6a61f93.p3386xf51b86f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\f"}, d2 = {"Lurgen/ur_C563/URS_91DC;", "", "", "UR_8D02", "", "open", "value", "functionId", "Ljz5/f0;", "UR_CCBA", "<init>", "()V", "plugin-ilink_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: urgen.ur_C563.URS_91DC */
/* loaded from: classes.dex */
public final class C30585x27a7ee0 {

    /* renamed from: INSTANCE */
    public static final p3380x6a61f93.p3386xf51b86f1.C30585x27a7ee0 f77182x4fbc8495 = new p3380x6a61f93.p3386xf51b86f1.C30585x27a7ee0();

    private C30585x27a7ee0() {
    }

    /* renamed from: UR_8D02 */
    public static final long m170074x21b44270() {
        return c01.z1.i();
    }

    /* renamed from: UR_CCBA */
    public static final void m170075x21b94101(boolean z17, long j17, long j18) {
        long i17 = c01.z1.i();
        long j19 = z17 ? i17 & (~j17) : i17 | j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtStatus2JavaStatic", "switchStateChange open: " + z17 + ", value: " + j17 + ", functionId: " + j18 + ", extStatus2: " + j19);
        int i18 = z17 ? 1 : 2;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(j19));
        r45.p53 p53Var = new r45.p53();
        p53Var.f464294d = (int) j18;
        p53Var.f464295e = i18;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
    }
}
