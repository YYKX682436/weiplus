package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes2.dex */
public abstract class rb implements androidx.lifecycle.k0 {
    public abstract void a(com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var);

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        com.tencent.mm.sdk.platformtools.Log.c("Finder.RedDotObserver", hashCode() + "[onChanged] result=" + z9Var, new java.lang.Object[0]);
        a(z9Var);
    }
}
