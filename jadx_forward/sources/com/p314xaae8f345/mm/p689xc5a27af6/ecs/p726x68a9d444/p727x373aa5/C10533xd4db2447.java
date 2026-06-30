package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p726x68a9d444.p727x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/feature/ecs/kfproductcard/view/EcsKfProductCardItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.kfproductcard.view.EcsKfProductCardItemView */
/* loaded from: classes9.dex */
public final class C10533xd4db2447 extends android.widget.FrameLayout {

    /* renamed from: d */
    public final com.p314xaae8f345.mm.ui.C21405x85fc1ce0 f147172d;

    /* renamed from: e */
    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10563x3e05669b f147173e;

    /* renamed from: f */
    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10561xa6ce4991 f147174f;

    /* renamed from: g */
    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10561xa6ce4991 f147175g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10533xd4db2447(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public static /* synthetic */ bw5.p9 b(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p726x68a9d444.p727x373aa5.C10533xd4db2447 c10533xd4db2447, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.Integer num, boolean z17, java.lang.Integer num2, int i18, java.lang.Object obj) {
        return c10533xd4db2447.a(str, str2, str3, i17, num, z17, (i18 & 64) != 0 ? null : num2);
    }

    public final bw5.p9 a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.Integer num, boolean z17, java.lang.Integer num2) {
        bw5.p9 p9Var = new bw5.p9();
        p9Var.d(1);
        bw5.d9 d9Var = new bw5.d9();
        bw5.a9 a9Var = new bw5.a9();
        java.util.LinkedList linkedList = a9Var.f106620d;
        bw5.c9 c9Var = new bw5.c9();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        c9Var.e(str);
        c9Var.f(str2);
        c9Var.g(str3);
        c9Var.d(i17);
        boolean[] zArr = c9Var.f107520t;
        if (num != null) {
            c9Var.f107512i = num.intValue();
            zArr[6] = true;
        }
        c9Var.f107511h = z17 ? 500 : 400;
        zArr[5] = true;
        if (num2 != null) {
            c9Var.f107513m = num2.intValue();
            zArr[7] = true;
        }
        linkedList.add(c9Var);
        d9Var.c(a9Var);
        p9Var.c(d9Var);
        return p9Var;
    }

    public /* synthetic */ C10533xd4db2447(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10533xd4db2447(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e4f, (android.view.ViewGroup) this, true);
        setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.czy);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f565678t62);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f147172d = (com.p314xaae8f345.mm.ui.C21405x85fc1ce0) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f565681t65);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f147173e = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10563x3e05669b) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f565677t61);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f147174f = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10561xa6ce4991) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.f565679t63);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f147175g = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10561xa6ce4991) findViewById4;
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        setLayoutParams(layoutParams == null ? new android.view.ViewGroup.LayoutParams(-1, -2) : layoutParams);
    }
}
