package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class n0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f290923d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f290924e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f290925f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f290926g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f290927h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f f290928i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f activityC21341x70473b8f, android.view.View view) {
        super(view);
        this.f290928i = activityC21341x70473b8f;
        this.f290923d = view;
        this.f290924e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f290925f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o8y);
        this.f290926g = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kbf);
        this.f290927h = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a9m);
        view.setOnClickListener(new com.p314xaae8f345.mm.ui.i0(this, activityC21341x70473b8f));
        view.setOnTouchListener(new com.p314xaae8f345.mm.ui.j0(this, activityC21341x70473b8f));
        view.setOnLongClickListener(new com.p314xaae8f345.mm.ui.m0(this, activityC21341x70473b8f));
    }
}
