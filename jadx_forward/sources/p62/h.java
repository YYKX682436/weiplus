package p62;

/* loaded from: classes11.dex */
public class h implements xg3.i0 {
    @Override // xg3.i0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        if (z65.c.f551991d) {
            return;
        }
        if (m0Var == null || l0Var == null || l0Var.f535945c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtOnMsgChanged", "onMsgChange, wrong args");
            return;
        }
        synchronized (n62.k.Di()) {
            android.database.Cursor m145256x1d3f4980 = n62.k.Ri().m145256x1d3f4980("select * from OpenMsgListener where (status = ?) ", "1");
            if (m145256x1d3f4980 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtOnMsgChanged", "onMsgChange onNotifyChange getValidOpenMsgListener cu == null");
                return;
            }
            m145256x1d3f4980.getCount();
            if (m145256x1d3f4980.getCount() <= 0) {
                m145256x1d3f4980.close();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtOnMsgChanged", "onMsgChange onNotifyChange cu.getCount() <= 0");
                return;
            }
            m145256x1d3f4980.close();
            for (int i17 = 0; i17 < l0Var.f535945c.size(); i17++) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) l0Var.f535945c.get(i17);
                if (f9Var != null && f9Var.A0() == 0 && f9Var.P0() != 4 && f9Var.mo78013xfb85f7b0() != 9999 && f9Var.mo78013xfb85f7b0() != 10000 && !c01.e2.U(f9Var.Q0()) && !c01.e2.Q(f9Var.Q0())) {
                    java.lang.Integer num = (java.lang.Integer) n62.k.Di().f416734h.get(f9Var.Q0());
                    if (num == null) {
                        n62.k.Di().f416734h.put(f9Var.Q0(), 1);
                    } else {
                        n62.k.Di().f416734h.put(f9Var.Q0(), java.lang.Integer.valueOf(num.intValue() + 1));
                        num.intValue();
                    }
                }
            }
            if (n62.k.Di().f416734h.size() > 0) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = n62.k.Di().f416736m;
                n3Var.mo50303x856b99f0(0);
                n3Var.mo50307xb9e94560(0, 1600L);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtOnMsgChanged", "notifyMsgUsers.size < 1");
            }
        }
    }
}
