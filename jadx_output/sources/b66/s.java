package b66;

/* loaded from: classes11.dex */
public class s extends com.tencent.unit_rc.BaseProxyObject implements b66.r {
    @Override // b66.r
    public void G2() {
        urgen.ur_2BA9.UR_12FB.UR_B39A(getCppPointer());
    }

    @Override // b66.r
    public void bd(int i17, b66.a aVar, bw5.kq0 kq0Var, int i18) {
        urgen.ur_2BA9.UR_12FB.UR_227C(getCppPointer(), i17, aVar, kq0Var != null ? kq0Var.toByteArray() : null, i18);
    }

    @Override // b66.r
    public void fd(bw5.kq0 kq0Var, bw5.pq0 state, bw5.lq0 event, bw5.mq0 mq0Var) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(event, "event");
        urgen.ur_2BA9.UR_12FB.UR_B1C5(getCppPointer(), kq0Var != null ? kq0Var.toByteArray() : null, state.f31808d, event.f29930d, mq0Var != null ? mq0Var.toByteArray() : null);
    }

    @Override // b66.r
    public void h5(b66.a aVar, b66.a aVar2) {
        urgen.ur_2BA9.UR_12FB.UR_D5C6(getCppPointer(), aVar, aVar2);
    }

    @Override // b66.r
    public void m0(bw5.kq0 kq0Var) {
        urgen.ur_2BA9.UR_12FB.UR_35FF(getCppPointer(), kq0Var != null ? kq0Var.toByteArray() : null);
    }

    @Override // b66.r
    public void s0(byte[] context, bw5.iq0 event, byte[] info) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(info, "info");
        urgen.ur_2BA9.UR_12FB.UR_B16F(getCppPointer(), context, event.f28681d, info);
    }
}
