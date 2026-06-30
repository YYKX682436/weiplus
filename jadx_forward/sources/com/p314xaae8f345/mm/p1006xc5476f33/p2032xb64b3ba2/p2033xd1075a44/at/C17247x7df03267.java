package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.p2033xd1075a44.at;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BQ\u0012$\u0010\u0007\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/ringtone/widget/at/RingtoneAtSomeoneLiveList;", "Lcom/tencent/mm/plugin/mvvmlist/MMSearchLiveList;", "Ldy3/p;", "", "Lym3/f;", "Lym3/c;", "Lym3/d;", "dataSource", "Lym3/b;", "searchDataSource", "Lxm3/n0;", "config", "Landroidx/lifecycle/y;", "lifecycleOwner", "<init>", "(Lym3/f;Lym3/b;Lxm3/n0;Landroidx/lifecycle/y;)V", "plugin-ringtone_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneLiveList */
/* loaded from: classes.dex */
public final class C17247x7df03267 extends com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16716x792a9f32<dy3.p, java.lang.String> {
    public final java.util.ArrayList C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17247x7df03267(ym3.f dataSource, ym3.b searchDataSource, xm3.n0 config, p012xc85e97e9.p093xedfae76a.y lifecycleOwner) {
        super(dataSource, searchDataSource, config, lifecycleOwner);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchDataSource, "searchDataSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        this.C = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe
    public java.lang.String c() {
        return "MicroMsg.Mvvm.AtSomeoneLiveList";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe
    public java.util.List e(java.util.List snapshotList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotList, "snapshotList");
        kz5.g0.s(snapshotList);
        java.util.ArrayList arrayList = this.C;
        arrayList.clear();
        arrayList.add("🔍");
        java.util.Iterator it = snapshotList.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            dy3.p pVar = (dy3.p) it.next();
            if (pVar.f326130f == 2) {
                java.lang.String str2 = pVar.f326134m;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str)) {
                    pVar.f326132h = false;
                } else {
                    pVar.f326132h = true;
                    arrayList.add(str2);
                    str = str2;
                }
            } else {
                pVar.f326132h = false;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(snapshotList, 10));
        java.util.Iterator it6 = snapshotList.iterator();
        while (it6.hasNext()) {
            arrayList2.add((dy3.p) ((dy3.p) it6.next()).y0());
        }
        return arrayList2;
    }
}
