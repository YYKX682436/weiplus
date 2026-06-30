package com.p314xaae8f345.mm.ui.p2708x5ccaae3b;

/* loaded from: classes15.dex */
public class r extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2708x5ccaae3b.s f290291a;

    public r(com.p314xaae8f345.mm.ui.p2708x5ccaae3b.s sVar) {
        this.f290291a = sVar;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        this.f290291a.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f290291a.notifyDataSetInvalidated();
    }
}
