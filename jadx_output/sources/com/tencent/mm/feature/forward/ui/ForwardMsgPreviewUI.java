package com.tencent.mm.feature.forward.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/feature/forward/ui/ForwardMsgPreviewUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "feature-forward_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes.dex */
public final class ForwardMsgPreviewUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f67084e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f67085d = jz5.h.b(new q50.e(this));

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dye;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        hideActionBarOperationArea();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        ul5.k bounceView = getBounceView();
        if (bounceView != null) {
            bounceView.setBounceEnabled(false);
        }
        jz5.g gVar = this.f67085d;
        em.b bVar = (em.b) ((jz5.n) gVar).getValue();
        if (bVar.f254094q == null) {
            bVar.f254094q = (com.tencent.mm.ui.widget.button.WeButton) bVar.f254078a.findViewById(com.tencent.mm.R.id.f483482b02);
        }
        bVar.f254094q.setOnClickListener(new q50.c(this));
        ((em.b) ((jz5.n) gVar).getValue()).a().setOnClickListener(new q50.d(this));
    }

    @Override // com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(r50.n0.class);
        set.add(r50.a.class);
        set.add(p50.c.class);
    }
}
