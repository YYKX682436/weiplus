package com.p314xaae8f345.mm.ui.p2708x5ccaae3b;

/* loaded from: classes12.dex */
public final class v extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2708x5ccaae3b.x f290293a;

    public v(com.p314xaae8f345.mm.ui.p2708x5ccaae3b.x xVar, com.p314xaae8f345.mm.ui.p2708x5ccaae3b.u uVar) {
        this.f290293a = xVar;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.x xVar = this.f290293a;
        xVar.f290297e = xVar.a(xVar.f290296d);
        xVar.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.x xVar = this.f290293a;
        xVar.f290297e = xVar.a(xVar.f290296d);
        xVar.notifyDataSetInvalidated();
    }
}
