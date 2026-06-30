package bc2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f100689a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f100690b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f100691c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f100692d;

    public b(android.view.View root, boolean z17, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f100689a = root;
        this.f100690b = context;
        this.f100691c = "EcsFinderShoppingNotifyHolder";
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.sfx);
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        java.lang.Float dpSize = java.lang.Float.valueOf(14.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dpSize, "dpSize");
        textView.setTextSize(1, ((dpSize.floatValue() * 1.0f) * j65.f.g()) / 400);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "apply(...)");
        this.f100692d = (android.widget.TextView) findViewById;
    }

    public final void a(bw5.kj0 kj0Var) {
        java.lang.String str = "";
        java.lang.String str2 = kj0Var != null ? kj0Var.f110935g[1] ? kj0Var.f110932d : "" : null;
        if (str2 == null || str2.length() == 0) {
            android.view.View view = this.f100689a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ecs/shopping/holder/EcsFinderShoppingNotifyHolder", "updateShelfMessageEntranceInfoInfo", "(Lcom/tencent/wechat/aff/proto/ShelfMessageEntranceInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/ecs/shopping/holder/EcsFinderShoppingNotifyHolder", "updateShelfMessageEntranceInfoInfo", "(Lcom/tencent/wechat/aff/proto/ShelfMessageEntranceInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f100689a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ecs/shopping/holder/EcsFinderShoppingNotifyHolder", "updateShelfMessageEntranceInfoInfo", "(Lcom/tencent/wechat/aff/proto/ShelfMessageEntranceInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/ecs/shopping/holder/EcsFinderShoppingNotifyHolder", "updateShelfMessageEntranceInfoInfo", "(Lcom/tencent/wechat/aff/proto/ShelfMessageEntranceInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (kj0Var != null) {
            java.lang.String str3 = kj0Var.f110935g[1] ? kj0Var.f110932d : "";
            if (str3 != null) {
                str = str3;
            }
        }
        this.f100692d.setText(str);
        this.f100689a.setOnClickListener(new bc2.a(this, kj0Var));
    }
}
