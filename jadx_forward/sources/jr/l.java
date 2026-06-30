package jr;

/* loaded from: classes4.dex */
public final class l implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6949xa773ed99 f382843a;

    public l(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6949xa773ed99 c6949xa773ed99) {
        this.f382843a = c6949xa773ed99;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        r45.af3 af3Var = (r45.af3) fVar.f152151d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateWordList: ");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(i18);
        sb6.append("; ");
        sb6.append((af3Var == null || (linkedList2 = af3Var.f451510d) == null) ? null : java.lang.Integer.valueOf(linkedList2.size()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiSuggestCache", sb6.toString());
        jr.m.f382844a = false;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6949xa773ed99 c6949xa773ed99 = this.f382843a;
        c6949xa773ed99.f142548e = currentTimeMillis;
        if (i17 == 0 && i18 == 0) {
            c6949xa773ed99.f142549f = 1L;
            c6949xa773ed99.f142550g = (af3Var == null || (linkedList = af3Var.f451510d) == null) ? 0 : linkedList.size();
            c6949xa773ed99.f142551h = c6949xa773ed99.b("WordVersion", java.lang.String.valueOf(af3Var != null ? af3Var.f451512f : 0L), true);
            if (af3Var != null && af3Var.f451510d.size() > 0) {
                gr.v vVar = gr.v.f356229a;
                int i19 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                vVar.a(false);
                vVar.b().putInt("word_list_update_time", i19);
                byte[] mo14344x5f01b1f6 = af3Var.mo14344x5f01b1f6();
                z85.x e17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().e();
                e17.getClass();
                e17.mo11260x413cb2b4(new z85.w("cache_type_words_list", mo14344x5f01b1f6));
                jr.j.f382838a.c();
            }
        } else {
            c6949xa773ed99.f142549f = 2L;
        }
        return java.lang.Boolean.valueOf(c6949xa773ed99.k());
    }
}
