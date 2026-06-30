package com.p314xaae8f345.mm.ui.p2724x335620.p2725x32b09e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012$\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tencent/mm/ui/mvvm/list/SelectContactMvvmList;", "Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "Lri5/j;", "Lym3/f;", "Lym3/c;", "Lym3/d;", "dataSource", "Lxm3/n0;", "config", "Landroidx/lifecycle/y;", "lifecycleOwner", "<init>", "(Lym3/f;Lxm3/n0;Landroidx/lifecycle/y;)V", "ui-selectcontact_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.mvvm.list.SelectContactMvvmList */
/* loaded from: classes.dex */
public final class C22460x20778e62 extends com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<ri5.j> {
    public final java.util.ArrayList A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22460x20778e62(ym3.f dataSource, xm3.n0 config, p012xc85e97e9.p093xedfae76a.y lifecycleOwner) {
        super(dataSource, config, lifecycleOwner, null, null, 24, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        this.A = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe
    public java.lang.String c() {
        return "MicroMsg.SelectContactLiveList";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe
    public java.util.List e(java.util.List snapshotList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotList, "snapshotList");
        kz5.g0.s(snapshotList);
        java.util.ArrayList arrayList = this.A;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (arrayList != null) {
            arrayList.add("🔍");
        }
        java.lang.String str = "";
        int i17 = 0;
        for (java.lang.Object obj : snapshotList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ri5.j jVar = (ri5.j) obj;
            int i19 = jVar.f477643e;
            ri5.h hVar = ri5.j.I;
            if (i19 == ri5.j.Z || i19 == ri5.j.Y || i19 == ri5.j.U || i19 == ri5.j.T) {
                java.lang.String str2 = jVar.f477652p;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str)) {
                    jVar.f477651o = false;
                } else {
                    jVar.f477651o = true;
                    int i27 = ri5.j.U;
                    int i28 = jVar.f477643e;
                    if (i28 != i27 && i28 != ri5.j.T) {
                        if (i28 == ri5.j.Y) {
                            if (arrayList != null) {
                                arrayList.add("☆");
                            }
                        } else if (arrayList != null) {
                            arrayList.add(str2);
                        }
                    }
                    str = str2;
                }
            }
            i17 = i18;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(snapshotList, 10));
        java.util.Iterator it = snapshotList.iterator();
        while (it.hasNext()) {
            arrayList2.add((ri5.j) ((ri5.j) it.next()).y0());
        }
        return arrayList2;
    }
}
