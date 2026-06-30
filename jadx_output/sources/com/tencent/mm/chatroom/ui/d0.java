package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class d0 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f64095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.b1 f64096b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f64097c;

    public d0(com.tencent.mm.ui.widget.dialog.z2 z2Var, com.tencent.mm.chatroom.ui.b1 b1Var, android.widget.CheckBox checkBox) {
        this.f64095a = z2Var;
        this.f64096b = b1Var;
        this.f64097c = checkBox;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        this.f64095a.B();
        this.f64096b.b(this.f64097c);
    }
}
