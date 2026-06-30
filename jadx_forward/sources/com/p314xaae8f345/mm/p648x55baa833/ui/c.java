package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes4.dex */
public final class c implements vg3.h3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10330xb121fb05 f145594a;

    public c(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10330xb121fb05 activityC10330xb121fb05) {
        this.f145594a = activityC10330xb121fb05;
    }

    @Override // vg3.h3
    public final void a(boolean z17, java.lang.String str, java.lang.String str2) {
        if (z17) {
            db5.t7.h(this.f145594a.mo55332x76847179(), this.f145594a.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572358ay3));
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_chat_room_open_id", str2);
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p648x55baa833.ui.b bVar = new com.p314xaae8f345.mm.p648x55baa833.ui.b(this.f145594a, intent);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(bVar, 500L, false);
        }
    }
}
