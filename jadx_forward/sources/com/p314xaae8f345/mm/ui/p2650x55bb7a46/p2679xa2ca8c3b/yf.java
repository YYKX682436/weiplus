package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class yf extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.pf {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f287614d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f287615e;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.pf
    public void a(android.view.View view) {
        android.view.ViewStub viewStub;
        if (this.f286796a == null && (viewStub = (android.view.ViewStub) view.findViewById(com.p314xaae8f345.mm.R.id.p3e)) != null) {
            viewStub.inflate();
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.bmz);
            this.f286796a = findViewById;
            this.f286797b = (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.obc);
            this.f287615e = (android.widget.TextView) this.f286796a.findViewById(com.p314xaae8f345.mm.R.id.o7z);
            this.f287614d = (android.widget.ImageView) this.f286796a.findViewById(com.p314xaae8f345.mm.R.id.kwm);
        }
    }
}
