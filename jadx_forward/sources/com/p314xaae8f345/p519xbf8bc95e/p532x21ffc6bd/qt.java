package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class qt extends android.widget.ListView {

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.mapsdk.internal.qt.a f132600a;

    /* loaded from: classes13.dex */
    public interface a {
        void g();
    }

    public qt(android.content.Context context) {
        super(context);
    }

    @Override // android.widget.AbsListView
    public final void handleDataChanged() {
        super.handleDataChanged();
        com.tencent.mapsdk.internal.qt.a aVar = this.f132600a;
        if (aVar != null) {
            aVar.g();
        }
    }

    /* renamed from: setOnDataChangedListener */
    public final void m36941x77b2b2dd(com.tencent.mapsdk.internal.qt.a aVar) {
        this.f132600a = aVar;
    }
}
