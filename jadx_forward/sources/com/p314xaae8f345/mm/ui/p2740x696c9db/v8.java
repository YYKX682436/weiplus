package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes12.dex */
public class v8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.w8 f292379e;

    public v8(com.p314xaae8f345.mm.ui.p2740x696c9db.w8 w8Var, android.view.View view) {
        this.f292379e = w8Var;
        this.f292378d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((android.view.inputmethod.InputMethodManager) this.f292379e.f292416d.getSystemService("input_method")).showSoftInput(this.f292378d.findViewById(com.p314xaae8f345.mm.R.id.d98), 0);
    }
}
