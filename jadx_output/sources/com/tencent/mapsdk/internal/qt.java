package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class qt extends android.widget.ListView {

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.mapsdk.internal.qt.a f51067a;

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
        com.tencent.mapsdk.internal.qt.a aVar = this.f51067a;
        if (aVar != null) {
            aVar.g();
        }
    }

    public final void setOnDataChangedListener(com.tencent.mapsdk.internal.qt.a aVar) {
        this.f51067a = aVar;
    }
}
