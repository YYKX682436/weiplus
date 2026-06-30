package com.tencent.mm.msgsubscription.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/msgsubscription/ui/BizSubscribeMsgManagerUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Li31/d;", "<init>", "()V", "m31/g", "plugin-comm_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
/* loaded from: classes9.dex */
public final class BizSubscribeMsgManagerUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements i31.d {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f71849n = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f71850d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f71851e = "";

    /* renamed from: f, reason: collision with root package name */
    public m31.f f71852f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f71853g;

    /* renamed from: h, reason: collision with root package name */
    public i31.a f71854h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.msgsubscription.ui.MaxRecyclerView f71855i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f71856m;

    public final void U6(boolean z17) {
        m31.f fVar = this.f71852f;
        boolean z18 = (fVar != null ? fVar.getItemCount() : 0) > 0;
        com.tencent.mm.msgsubscription.ui.MaxRecyclerView maxRecyclerView = this.f71855i;
        if (maxRecyclerView == null) {
            kotlin.jvm.internal.o.o("subscribeMsgList");
            throw null;
        }
        maxRecyclerView.setVisibility((z18 && z17) ? 0 : 8);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nrf);
        if (!z18 || z17) {
            textView.setVisibility(8);
        } else {
            java.lang.String string = getString(com.tencent.mm.R.string.ake);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{this.f71851e}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            textView.setText(format);
            textView.setVisibility(0);
        }
        m31.f fVar2 = this.f71852f;
        if (fVar2 != null) {
            fVar2.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        i31.a aVar = this.f71854h;
        if (aVar != null) {
            aVar.g(this);
        }
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488223l2;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("key_biz_presenter_class");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (stringExtra.length() == 0) {
            throw new java.lang.Exception("Presenter ClassName is empty");
        }
        try {
            i31.a aVar = (i31.a) java.lang.Class.forName(stringExtra).newInstance();
            this.f71854h = aVar;
            if (aVar != null) {
                aVar.f288100a = this;
            }
            if (aVar != null) {
                aVar.d(this);
            }
            setMMTitle(com.tencent.mm.R.string.akf);
            i31.a aVar2 = this.f71854h;
            this.f71852f = aVar2 != null ? aVar2.c(this) : null;
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.iiv);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            this.f71856m = (android.widget.LinearLayout) findViewById;
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.nra);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            com.tencent.mm.msgsubscription.ui.MaxRecyclerView maxRecyclerView = (com.tencent.mm.msgsubscription.ui.MaxRecyclerView) findViewById2;
            this.f71855i = maxRecyclerView;
            maxRecyclerView.setAdapter(this.f71852f);
            com.tencent.mm.msgsubscription.ui.MaxRecyclerView maxRecyclerView2 = this.f71855i;
            if (maxRecyclerView2 == null) {
                kotlin.jvm.internal.o.o("subscribeMsgList");
                throw null;
            }
            maxRecyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this, 1, false));
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.nrd);
            kotlin.jvm.internal.o.e(findViewById3, "null cannot be cast to non-null type com.tencent.mm.ui.widget.MMSwitchBtn");
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById3;
            this.f71853g = mMSwitchBtn;
            mMSwitchBtn.setSwitchListener(new m31.h(this));
            android.widget.LinearLayout linearLayout = this.f71856m;
            if (linearLayout == null) {
                kotlin.jvm.internal.o.o("ll");
                throw null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(getResources().getString(com.tencent.mm.R.string.aki));
            sb6.append(',');
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = this.f71853g;
            sb6.append((java.lang.Object) (mMSwitchBtn2 != null ? mMSwitchBtn2.getContentDescription() : null));
            linearLayout.setContentDescription(sb6.toString());
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn3 = this.f71853g;
            if (mMSwitchBtn3 != null) {
                mMSwitchBtn3.setFocusable(false);
            }
            java.lang.String stringExtra2 = getIntent().getStringExtra("key_biz_username");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.f71850d = stringExtra2;
            java.lang.String stringExtra3 = getIntent().getStringExtra("key_biz_nickname");
            java.lang.String str = stringExtra3 != null ? stringExtra3 : "";
            this.f71851e = str;
            m31.f fVar = this.f71852f;
            if (fVar != null) {
                fVar.f323139i = str;
            }
            java.lang.String str2 = this.f71850d;
            i31.a aVar3 = this.f71854h;
            if (aVar3 != null) {
                aVar3.a(str2, new m31.j(this));
            }
            setBackBtn(new m31.k(this));
        } catch (java.lang.Exception e17) {
            throw new java.lang.Exception("create presenter instance fail!", e17);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        i31.a aVar = this.f71854h;
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizSubscribeMsgManagerUI", "onDestroy");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        i31.a aVar = this.f71854h;
        if (aVar != null) {
            aVar.e(this);
        }
        super.onPause();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        i31.a aVar = this.f71854h;
        if (aVar != null) {
            aVar.f(this);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(m31.g.class);
    }
}
