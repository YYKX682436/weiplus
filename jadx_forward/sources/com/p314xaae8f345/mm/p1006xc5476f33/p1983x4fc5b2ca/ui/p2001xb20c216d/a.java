package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d;

/* loaded from: classes5.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e f237628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f237629e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e, android.content.Context context) {
        this.f237628d = c17040x9d8b708e;
        this.f237629e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e c17040x9d8b708e = this.f237628d;
        c17040x9d8b708e.mo68197x61153ca1(!c17040x9d8b708e.getMuteOrigin());
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a callback = c17040x9d8b708e.getCallback();
        if (callback != null) {
            callback.g(c17040x9d8b708e.getMuteOrigin());
        }
        boolean muteOrigin = c17040x9d8b708e.getMuteOrigin();
        android.content.Context context = this.f237629e;
        if (muteOrigin) {
            c17040x9d8b708e.f237510q.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f81269x8985689d, -1));
            c17040x9d8b708e.i(c17040x9d8b708e.f237513t, com.p314xaae8f345.mm.R.id.f564305nk, com.p314xaae8f345.mm.R.C30867xcad56011.f571482ge);
        } else {
            c17040x9d8b708e.f237510q.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, c17040x9d8b708e.G, c17040x9d8b708e.H));
            c17040x9d8b708e.i(c17040x9d8b708e.f237513t, com.p314xaae8f345.mm.R.id.f564305nk, com.p314xaae8f345.mm.R.C30867xcad56011.f571483gf);
        }
        c17040x9d8b708e.f237513t.setTag(com.p314xaae8f345.mm.R.id.e7_, java.lang.Boolean.valueOf(!c17040x9d8b708e.getMuteOrigin()));
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
