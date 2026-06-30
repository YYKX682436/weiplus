package com.tencent.mm.chatroom.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/chatroom/ui/InvitationReasonEditorUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "ui-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class InvitationReasonEditorUI extends com.tencent.mm.ui.vas.VASActivity {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f63786d = jz5.h.b(new com.tencent.mm.chatroom.ui.e4(this));

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ehf;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setBackGroundColorResource(com.tencent.mm.R.color.aay);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.o_w);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.fk.b((android.widget.TextView) findViewById);
        setActionbarColor(getColor(com.tencent.mm.R.color.aay));
        setBackBtn(new com.tencent.mm.chatroom.ui.f4(this), com.tencent.mm.R.raw.xmark_regular);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490551ya), new com.tencent.mm.chatroom.ui.g4(this), null, com.tencent.mm.ui.fb.GREEN);
    }
}
