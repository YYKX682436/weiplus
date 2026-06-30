package com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012$\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tencent/mm/ui/contact/address/AddressLiveList;", "Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "Ltf5/g;", "Lym3/f;", "Lym3/c;", "Lym3/d;", "dataSource", "Lxm3/n0;", "config", "Landroidx/lifecycle/y;", "lifecycleOwner", "<init>", "(Lym3/f;Lxm3/n0;Landroidx/lifecycle/y;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.contact.address.AddressLiveList */
/* loaded from: classes10.dex */
public final class C22340x11f0039e extends com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<tf5.g> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22340x11f0039e(ym3.f dataSource, xm3.n0 config, p012xc85e97e9.p093xedfae76a.y lifecycleOwner) {
        super(dataSource, config, lifecycleOwner, null, null, 24, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe
    public java.lang.String c() {
        return "MicroMsg.Mvvm.AddressLiveList";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe
    public java.util.List e(java.util.List snapshotList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotList, "snapshotList");
        kz5.g0.s(snapshotList);
        java.util.Iterator it = snapshotList.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            tf5.g gVar = (tf5.g) it.next();
            int i17 = gVar.f500512e;
            if (i17 == 2 || i17 == 1) {
                java.lang.String str2 = gVar.f500515h;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str)) {
                    gVar.f500514g = false;
                } else {
                    gVar.f500514g = true;
                    str = str2;
                }
            } else {
                gVar.f500514g = false;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(snapshotList, 10));
        java.util.Iterator it6 = snapshotList.iterator();
        while (it6.hasNext()) {
            arrayList.add((tf5.g) ((tf5.g) it6.next()).y0());
        }
        return arrayList;
    }
}
