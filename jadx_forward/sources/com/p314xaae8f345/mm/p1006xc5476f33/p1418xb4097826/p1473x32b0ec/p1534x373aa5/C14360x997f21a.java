package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout$notifyShowCommentStorage$1 */
/* loaded from: classes3.dex */
public final class C14360x997f21a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: $liveId */
    final /* synthetic */ long f35842x2eaa844b;

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 f35843xcbdd23aa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14360x997f21a(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419) {
        super(0);
        this.f35842x2eaa844b = j17;
        this.f35843xcbdd23aa = c14353xe7c1f419;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo152xb9724478() {
        m57527xb9724478();
        return jz5.f0.f384359a;
    }

    /* renamed from: invoke */
    public final void m57527xb9724478() {
        java.util.List list;
        java.util.List list2;
        dk2.q5 q5Var = dk2.q5.f315472a;
        long j17 = this.f35842x2eaa844b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micro.FinderLiveCommentTemporaryStorage", "[getComments] liveId=" + j17);
        synchronized (q5Var.b()) {
            dk2.l5 l5Var = (dk2.l5) q5Var.b().get(java.lang.Long.valueOf(j17));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getComments-enter] liveId=");
            sb6.append(j17);
            sb6.append(", size=");
            sb6.append((l5Var == null || (list2 = l5Var.f315250b) == null) ? 0 : list2.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micro.FinderLiveCommentTemporaryStorage", sb6.toString());
            if (l5Var != null) {
                if (c01.id.c() - l5Var.f315251c < 30000) {
                    list = l5Var.f315250b;
                } else {
                    q5Var.b().m77803xc84af884(java.lang.Long.valueOf(j17));
                }
            }
            list = null;
        }
        if (list != null) {
            java.util.List list3 = list.isEmpty() ^ true ? list : null;
            if (list3 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = this.f35843xcbdd23aa;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list3) {
                    if (!((mm2.x4) c14353xe7c1f419.m57635xbba4bfc0(mm2.x4.class)).f411077y.contains(((dk2.zf) obj).v())) {
                        arrayList.add(obj);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f4192 = this.f35843xcbdd23aa;
                java.util.List list4 = ((mm2.x4) c14353xe7c1f4192.m57635xbba4bfc0(mm2.x4.class)).f411077y;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((dk2.zf) it.next()).v());
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj2 : arrayList2) {
                    java.lang.String str = (java.lang.String) obj2;
                    if (!(str == null || str.length() == 0)) {
                        arrayList3.add(obj2);
                    }
                }
                list4.addAll(arrayList3);
                ((mm2.x4) c14353xe7c1f4192.m57635xbba4bfc0(mm2.x4.class)).f411061f.addAll(arrayList);
                c14353xe7c1f4192.m57487x4ae41235();
            }
        }
    }
}
