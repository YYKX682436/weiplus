package com.p314xaae8f345.mm.ui.p2708x5ccaae3b;

/* loaded from: classes15.dex */
public class c extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2708x5ccaae3b.h f290263a;

    public c(com.p314xaae8f345.mm.ui.p2708x5ccaae3b.h hVar) {
        this.f290263a = hVar;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.h hVar = this.f290263a;
        hVar.f290276f = 0;
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.b bVar = hVar.f290274d;
        int e17 = bVar.e();
        if (e17 == 0) {
            hVar.f290276f = bVar.getCount();
        } else {
            for (int i17 = 0; i17 < e17; i17++) {
                hVar.f290276f += bVar.b(i17) + hVar.f290279i;
            }
        }
        hVar.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.h hVar = this.f290263a;
        ((java.util.ArrayList) hVar.f290278h).clear();
        hVar.notifyDataSetInvalidated();
    }
}
