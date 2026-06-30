package ot0;

/* loaded from: classes8.dex */
public class l1 extends ot0.n0 {
    public l1() {
        this.f430139q = new ot0.s0();
    }

    public void b(android.os.Bundle bundle) {
        try {
            if (((km0.c) gm0.j1.p().a()).a()) {
                int i17 = this.f430139q.f430303o;
                if (i17 == 5 || i17 == 8) {
                    java.util.LinkedList linkedList = this.f430140r;
                    if (linkedList.size() == 0) {
                        linkedList.add(tv.a.b(qk.c.b(this.f430139q.f430299i, 4, true)));
                    }
                }
            }
            bundle.putByteArray("biz_mp_msg_info", mo14344x5f01b1f6());
            bundle.putString("rawUrl", this.f430139q.f430295e);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MPMsgInfo", "writeToIntent %s", e17.getMessage());
        }
    }
}
