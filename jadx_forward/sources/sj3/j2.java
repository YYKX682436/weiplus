package sj3;

/* loaded from: classes8.dex */
public final class j2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f490132d;

    public j2(sj3.g3 g3Var) {
        this.f490132d = g3Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Object obj2;
        java.util.List list = (java.util.List) obj;
        tj3.x xVar = this.f490132d.f490066n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        xVar.getClass();
        int size = list.size();
        java.util.List list2 = xVar.f501337c;
        java.util.ArrayList arrayList = (java.util.ArrayList) list2;
        if (size != arrayList.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAvatarLayoutAdapter", "response list change");
            arrayList.clear();
            arrayList.addAll(list);
            if (xVar.f501339e) {
                xVar.f501340f = true;
                xVar.f501339e = false;
            }
            xVar.f501336b.mo152xb9724478();
            return;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj2 = it.next();
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.t) obj2).a()) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        boolean z17 = obj2 != null;
        int size2 = list.size();
        for (int i17 = 0; i17 < size2; i17++) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kz5.n0.a0(list2, i17), list.get(i17))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAvatarLayoutAdapter", "response list change");
                java.util.ArrayList arrayList2 = (java.util.ArrayList) list2;
                arrayList2.clear();
                arrayList2.addAll(list);
                if (z17 != xVar.f501339e) {
                    xVar.f501340f = true;
                    xVar.f501339e = z17;
                }
                xVar.f501336b.mo152xb9724478();
                return;
            }
        }
    }
}
