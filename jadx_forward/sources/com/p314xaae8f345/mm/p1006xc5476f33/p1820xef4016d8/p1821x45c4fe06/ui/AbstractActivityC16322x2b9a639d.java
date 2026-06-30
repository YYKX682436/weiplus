package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui;

/* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI */
/* loaded from: classes9.dex */
public abstract class AbstractActivityC16322x2b9a639d extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public mb3.c f226534d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f226535e = 4095;

    /* renamed from: f, reason: collision with root package name */
    public final android.util.SparseArray f226536f = new android.util.SparseArray();

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Class[][] f226537g = {new java.lang.Class[]{pb3.b.class, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1824x408272e3.ActivityC16327xba05db3f.class}, new java.lang.Class[]{ob3.c.class, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1823xed060d07.ActivityC16326x540b7c63.class}, new java.lang.Class[]{nb3.b.class, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1822xb06a1851.ActivityC16324x5371571d.class}, new java.lang.Class[]{ob3.b.class, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1823xed060d07.ActivityC16325x59fa9805.class}};

    public void T6(java.lang.Class cls, android.content.Intent intent, mb3.d dVar) {
        if (getMainLooper().getThread() != java.lang.Thread.currentThread()) {
            runOnUiThread(new mb3.a(this, cls, intent, dVar));
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        java.lang.Class<?> cls2 = null;
        for (java.lang.Class<?>[] clsArr : this.f226537g) {
            if (clsArr[0] == cls) {
                cls2 = clsArr[1];
            }
        }
        if (cls2 == null) {
            throw new java.lang.IllegalStateException("proceed to ui = [" + cls.getName() + "], but Target is null");
        }
        intent.setClass(mo55332x76847179(), cls2);
        if (dVar != null) {
            int i17 = this.f226535e;
            this.f226535e = i17 + 1;
            startActivityForResult(intent, i17);
            this.f226536f.put(i17, dVar);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyBaseUI", "proceed", "(Ljava/lang/Class;Landroid/content/Intent;Lcom/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyUIRouter$OnBackListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyBaseUI", "proceed", "(Ljava/lang/Class;Landroid/content/Intent;Lcom/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyUIRouter$OnBackListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        mb3.d dVar = (mb3.d) this.f226536f.get(i17);
        if (dVar == null) {
            super.onActivityResult(i17, i18, intent);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HjLuckyMoneyBaseUI", "damon warns you, requestCode == [%d], I used it, and skip. check your code if needed!!!!", java.lang.Integer.valueOf(i17));
            dVar.a(i18, intent);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mb3.c cVar = new mb3.c(this);
        this.f226534d = cVar;
        android.content.res.Resources resources = cVar.f228569a.getResources();
        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560875wx));
        int color = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560876wy);
        int color2 = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560882x3);
        int color3 = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560882x3);
        int color4 = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560888x9);
        if (cVar.f228569a.mo2533x106ab264() != null) {
            cVar.f228569a.mo2533x106ab264().w(colorDrawable);
            android.view.View j17 = cVar.f228569a.mo2533x106ab264().j();
            if (j17 != null) {
                android.view.View findViewById = j17.findViewById(com.p314xaae8f345.mm.R.id.d0v);
                if (findViewById != null && color != 0) {
                    findViewById.setBackgroundColor(color);
                }
                android.widget.TextView textView = (android.widget.TextView) j17.findViewById(android.R.id.text1);
                if (textView != null && color2 != 0) {
                    textView.setTextColor(color2);
                }
                android.widget.TextView textView2 = (android.widget.TextView) j17.findViewById(android.R.id.text2);
                if (textView2 != null && color3 != 0) {
                    textView2.setTextColor(color3);
                }
                android.widget.ImageView imageView = (android.widget.ImageView) j17.findViewById(com.p314xaae8f345.mm.R.id.f78239x65c2f76a);
                if (imageView != null) {
                    imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.alp);
                }
            }
            if (color4 != 0) {
                android.view.Window window = cVar.f228569a.getWindow();
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(color4);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f226534d = null;
        this.f226536f.clear();
        super.onDestroy();
    }
}
