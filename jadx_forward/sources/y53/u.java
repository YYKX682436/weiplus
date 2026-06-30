package y53;

/* loaded from: classes8.dex */
public final class u implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f541037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u53.x f541038b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f541039c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y53.x f541040d;

    public u(java.util.List list, u53.x xVar, java.util.HashMap hashMap, y53.x xVar2) {
        this.f541037a = list;
        this.f541038b = xVar;
        this.f541039c = hashMap;
        this.f541040d = xVar2;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        int p17;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        java.util.HashMap hashMap = this.f541039c;
        if (i17 == 0 && fVar.f152149b == 0 && (linkedList = ((v53.k) fVar.f152151d).f514878d) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ContactService", "get contact from server success, count %d", java.lang.Integer.valueOf(linkedList.size()));
            java.util.LinkedList<v53.b> chat_user_info_list = ((v53.k) fVar.f152151d).f514878d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(chat_user_info_list, "chat_user_info_list");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(chat_user_info_list, 10));
            for (v53.b bVar : chat_user_info_list) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
                y53.m mVar = new y53.m();
                mVar.f67433xdec927b = bVar.f514856d;
                mVar.f67429x21f9b213 = bVar.f514857e;
                mVar.f67427x81118851 = bVar.f514858f;
                mVar.f67430x4b6e7fa1 = bVar.f514859g;
                mVar.f67431x4b6e82d5 = bVar.f514860h;
                mVar.f67428xe860fa1 = bVar.f514861i;
                mVar.f67426x9f600742 = bVar.f514862m;
                arrayList.add(mVar);
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                y53.m mVar2 = (y53.m) it.next();
                mVar2.u0();
                y53.x xVar = this.f541040d;
                xVar.getClass();
                java.lang.String t07 = mVar2.t0();
                xVar.f541044d.put(t07, mVar2);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().k0(t07);
                y53.a0 Ri = ((t53.m0) i95.n0.c(t53.m0.class)).Ri();
                mVar2.f67432xa783a79b = c01.id.c();
                java.lang.String field_username = mVar2.f67433xdec927b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username, "field_username");
                y53.m y07 = Ri.y0(field_username);
                l75.k0 k0Var = Ri.f541002d;
                if (y07 == null) {
                    p17 = (int) k0Var.l("GameLifeContact", dm.i4.f66875xa013b0d5, mVar2.mo9763xeb27878e());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ContactStorage", "insertContact[" + p17 + "] " + mVar2.u0());
                } else {
                    android.content.ContentValues mo9763xeb27878e = mVar2.mo9763xeb27878e();
                    mo9763xeb27878e.remove("rowid");
                    java.lang.String field_username2 = mVar2.f67433xdec927b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username2, "field_username");
                    p17 = k0Var.p("GameLifeContact", mo9763xeb27878e, "username=?", new java.lang.String[]{field_username2});
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ContactStorage", "updateContact[" + p17 + "] " + mVar2.u0());
                }
                if (p17 > 0) {
                    Ri.mo142179xf35bbb4("GameLifeContact", 3, mVar2.t0());
                }
                hashMap.put(mVar2.t0(), mVar2);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameLife.ContactService", "get contact from server failed " + fVar.f152148a + ' ' + fVar.f152149b + ' ' + fVar.f152150c);
        }
        for (java.lang.String str : this.f541037a) {
            if (!hashMap.containsKey(str)) {
                y53.m mVar3 = new y53.m();
                mVar3.f67433xdec927b = str;
                mVar3.B = false;
                hashMap.put(str, mVar3);
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(hashMap, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.tencent.mm.plugin.gamelife.api.IGameLifeContact>");
        this.f541038b.a(hashMap);
        return jz5.f0.f384359a;
    }
}
