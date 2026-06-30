package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/j;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes10.dex */
public final class j implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        if (c10756x2a5d7b2d != null) {
            java.lang.String str = c10756x2a5d7b2d.f149939d;
            if (!(str == null || str.length() == 0)) {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                java.lang.String str2 = c10756x2a5d7b2d.f149939d;
                if (str2 == null) {
                    str2 = "";
                }
                long Z = pm0.v.Z(str2);
                c61.l7 l7Var = (c61.l7) b6Var;
                l7Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommonFeatureService", "tryGetFinderVideoInfoForMp objectId:" + Z);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 Yk = l7Var.Yk(Z, "", 184, "");
                r45.n23 n23Var = new r45.n23();
                n23Var.set(0, Yk);
                if (Yk != null && (m76802x2dd01666 = Yk.m76802x2dd01666()) != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null && (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) != null) {
                    r45.mb4 i17 = bu2.z.i(c19788xd7cfd73e);
                    mn2.g4 c17 = ds2.h.f324399a.c(Yk.m76784x5db1b11(), i17, false);
                    n23Var.set(1, c17.n());
                    n23Var.set(2, c17.mo148084xb5887639());
                    n23Var.set(3, c17.mo148083xfb83cc9b());
                    n23Var.set(4, java.lang.Integer.valueOf(((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Ai(1, c17.mo148083xfb83cc9b())));
                    n23Var.set(5, c17.g());
                    n23Var.set(6, c17.i());
                    n23Var.set(7, c17.h());
                    n23Var.set(8, java.lang.Boolean.valueOf(i17.m75939xb282bd08(39) == 1));
                    n23Var.set(9, 184);
                    n23Var.set(13, java.lang.Integer.valueOf(c17.f411539i));
                    n23Var.set(10, "tryGetFinderObjectFromMp");
                    if (!android.text.TextUtils.isEmpty(n23Var.m75945x2fec8307(1))) {
                        cu2.x xVar = cu2.x.f303982a;
                        java.lang.String m75945x2fec8307 = n23Var.m75945x2fec8307(1);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec8307);
                        so2.i3 c18 = cu2.x.c(xVar, m75945x2fec8307, false, false, false, 14, null);
                        n23Var.set(1, c18.f68981xaca5bdda);
                        if (com.p314xaae8f345.mm.vfs.w6.j(c18.u0())) {
                            n23Var.set(11, java.lang.Long.valueOf(c18.f68968x799e9d9e));
                            n23Var.set(12, java.lang.Long.valueOf(c18.f68989x78351860));
                            n23Var.set(13, java.lang.Integer.valueOf(c18.f68971xc0e4813d));
                            n23Var.set(14, java.lang.Integer.valueOf(c18.f68988x29d3a50c));
                            n23Var.set(21, java.lang.Boolean.valueOf(c18.f68982x84465715));
                        }
                    }
                }
                if (rVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19483xfc85b212 c19483xfc85b212 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19483xfc85b212();
                    c19483xfc85b212.f268516d = n23Var;
                    rVar.a(c19483xfc85b212);
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewVideoFinderActionHandler", "getFinderVideoInfo data invalid");
        if (rVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19483xfc85b212 c19483xfc85b2122 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19483xfc85b212();
            c19483xfc85b2122.f268516d = null;
            rVar.a(c19483xfc85b2122);
        }
    }
}
