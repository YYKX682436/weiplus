package pr;

/* loaded from: classes11.dex */
public final class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pr.h f439239a;

    public g(pr.h hVar) {
        this.f439239a = hVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.ri0 ri0Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        r45.ye yeVar = (r45.ye) fVar.f152151d;
        pr.h hVar = this.f439239a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f439245d, "requestNext: " + i17 + ", " + i18);
        jz5.f0 f0Var = jz5.f0.f384359a;
        yz5.p pVar = hVar.f439244c;
        if (i17 != 0 || i18 != 0) {
            if (pVar == null) {
                return null;
            }
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(hVar.f439246e));
            return f0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yeVar);
        java.util.LinkedList<r45.ri0> linkedList = yeVar.f472541g;
        if (linkedList != null) {
            boolean isEmpty = linkedList.isEmpty();
            java.lang.String str = hVar.f439245d;
            if (isEmpty) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "no serverEmojiList");
            } else {
                java.util.HashMap hashMap = new java.util.HashMap();
                for (r45.ri0 ri0Var2 : linkedList) {
                    if (ri0Var2 != null && !android.text.TextUtils.isEmpty(ri0Var2.f466422g)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "add designer id " + ri0Var2.f466422g + ", md5 " + ri0Var2.f466419d);
                        java.lang.String str2 = ri0Var2.f466419d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getMd5(...)");
                        hashMap.put(str2, ri0Var2);
                    }
                }
                java.util.ArrayList a17 = gr.t.g().a();
                if (a17.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "no localEmojis");
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = a17.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) it.next();
                        if (c21053xdbf1e5f4 != null && !android.text.TextUtils.isEmpty(c21053xdbf1e5f4.mo42933xb5885648()) && hashMap.containsKey(c21053xdbf1e5f4.mo42933xb5885648()) && (ri0Var = (r45.ri0) hashMap.get(c21053xdbf1e5f4.mo42933xb5885648())) != null && android.text.TextUtils.isEmpty(c21053xdbf1e5f4.f68657xb76d85ab)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "designer id match " + ri0Var.f466422g + " , md5: " + ri0Var.f466419d);
                            arrayList.add(ri0Var);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        java.util.Iterator it6 = arrayList.iterator();
                        while (it6.hasNext()) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(((r45.ri0) it6.next()).f466419d);
                            if (u17 != null && u17.f68683x1d5dc4d == 0) {
                                u17.f68683x1d5dc4d = 1;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "update storeunique ret " + com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().G2(u17));
                            }
                        }
                    }
                }
            }
        }
        if (linkedList != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().O2(linkedList);
        }
        if (hVar.f439247f < hVar.f439242a.size()) {
            hVar.a();
            return f0Var;
        }
        if (pVar == null) {
            return f0Var;
        }
        pVar.mo149xb9724478(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(hVar.f439247f));
        return f0Var;
    }
}
