package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/i;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCLong;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes8.dex */
public final class i implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        long j17 = 0;
        if (c10756x2a5d7b2d != null) {
            java.lang.String str = c10756x2a5d7b2d.f149939d;
            if (!(str == null || str.length() == 0)) {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                java.lang.String str2 = c10756x2a5d7b2d.f149939d;
                if (str2 == null) {
                    str2 = "";
                }
                c61.l7 l7Var = (c61.l7) b6Var;
                l7Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommonFeatureService", "tryGetFinderObjectFromMp");
                r45.n23 n23Var = null;
                try {
                    r45.an2 an2Var = new r45.an2();
                    an2Var.mo11468x92b714fd(android.util.Base64.decode(str2, 0));
                    java.lang.String m75945x2fec8307 = an2Var.m75945x2fec8307(1);
                    java.lang.String m75945x2fec83072 = an2Var.m75945x2fec8307(0);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 Yk = l7Var.Yk(0L, m75945x2fec8307, 184, m75945x2fec83072 == null ? "" : m75945x2fec83072);
                    r45.n23 n23Var2 = new r45.n23();
                    n23Var2.set(0, Yk);
                    if (Yk != null) {
                        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).rk(Yk, 184, null);
                    }
                    ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).oj(n23Var2);
                    n23Var = n23Var2;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderCommonFeatureService", "tryGetFinderObjectFromMp e:" + th6);
                }
                if (rVar != null) {
                    if (n23Var != null && (c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) n23Var.m75936x14adae67(0)) != null) {
                        j17 = c19792x256d2725.m76784x5db1b11();
                    }
                    rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898(j17));
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewVideoFinderActionHandler", "getFinderPlayInfo data invalid");
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898(0L));
        }
    }
}
