package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class mj implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f74049d;

    public mj(com.tencent.mm.plugin.account.ui.WelcomeActivity welcomeActivity, java.util.List list) {
        this.f74049d = list;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            java.util.Iterator it = this.f74049d.iterator();
            while (it.hasNext()) {
                g4Var.v((db5.h4) it.next());
            }
        }
    }
}
