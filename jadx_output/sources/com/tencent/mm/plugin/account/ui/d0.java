package com.tencent.mm.plugin.account.ui;

/* loaded from: classes8.dex */
public class d0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f73788d;

    public d0(com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI, java.util.List list) {
        this.f73788d = list;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.size() == 0) {
            java.util.Iterator it = this.f73788d.iterator();
            while (it.hasNext()) {
                g4Var.v((db5.h4) it.next());
            }
        }
    }
}
