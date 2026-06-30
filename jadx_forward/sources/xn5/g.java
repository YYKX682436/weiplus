package xn5;

/* loaded from: classes13.dex */
public abstract class g implements xn5.e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f537205d = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();

    /* renamed from: a, reason: collision with root package name */
    public int f537206a;

    /* renamed from: b, reason: collision with root package name */
    public int f537207b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f537208c;

    public android.view.View b(android.content.Context ctx, android.view.ViewGroup parent, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View c17 = c(ctx);
        if (c17 == null) {
            return null;
        }
        if (c17 instanceof com.p314xaae8f345.mm.p2776x373aa5.x2c.C22871x8161f454) {
            java.util.ArrayList<android.view.View> arrayList = new java.util.ArrayList();
            com.p314xaae8f345.mm.p2776x373aa5.x2c.C22871x8161f454 c22871x8161f454 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22871x8161f454) c17;
            int childCount = c22871x8161f454.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = c22871x8161f454.getChildAt(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
                arrayList.add(childAt);
            }
            c22871x8161f454.removeAllViews();
            for (android.view.View view : arrayList) {
                xn5.p0 p0Var = xn5.q0.f537235a;
                android.view.ViewGroup.LayoutParams generateLayoutParams = parent.generateLayoutParams(xn5.q0.f537238d);
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(generateLayoutParams);
                if (layoutParams != null) {
                    generateLayoutParams.width = layoutParams.width;
                    generateLayoutParams.height = layoutParams.height;
                }
                if ((layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) && (generateLayoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) generateLayoutParams;
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.rightMargin = marginLayoutParams2.rightMargin;
                    marginLayoutParams.topMargin = marginLayoutParams2.topMargin;
                    marginLayoutParams.leftMargin = marginLayoutParams2.leftMargin;
                    marginLayoutParams.bottomMargin = marginLayoutParams2.bottomMargin;
                    marginLayoutParams.setMarginStart(marginLayoutParams2.getMarginStart());
                    marginLayoutParams.setMarginEnd(marginLayoutParams2.getMarginEnd());
                }
                parent.addView(c17);
            }
        } else {
            xn5.p0 p0Var2 = xn5.q0.f537235a;
            c17.setLayoutParams(parent.generateLayoutParams(xn5.q0.f537238d));
            java.lang.Object tag = c17.getTag(com.p314xaae8f345.mm.R.id.psd);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            android.view.ViewGroup.LayoutParams layoutParams2 = (android.view.ViewGroup.LayoutParams) tag;
            android.view.ViewGroup.LayoutParams layoutParams3 = c17.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(layoutParams3, "getLayoutParams(...)");
            layoutParams3.width = layoutParams2.width;
            layoutParams3.height = layoutParams2.height;
            if ((layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) && (layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams)) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = (android.view.ViewGroup.MarginLayoutParams) layoutParams3;
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams3.rightMargin = marginLayoutParams4.rightMargin;
                marginLayoutParams3.topMargin = marginLayoutParams4.topMargin;
                marginLayoutParams3.leftMargin = marginLayoutParams4.leftMargin;
                marginLayoutParams3.bottomMargin = marginLayoutParams4.bottomMargin;
                marginLayoutParams3.setMarginStart(marginLayoutParams4.getMarginStart());
                marginLayoutParams3.setMarginEnd(marginLayoutParams4.getMarginEnd());
            }
            if (z17) {
                parent.addView(c17);
            }
        }
        return c17;
    }

    public abstract android.view.View c(android.content.Context context);

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(android.content.Context ctx, android.view.View view, java.lang.String name, boolean z17, int i17) {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        if (view != 0) {
            m(ctx, view, name);
            if (view instanceof xn5.a0) {
                ((xn5.a0) view).onFinishInflate();
            }
            if (z17) {
                view.setTag(com.p314xaae8f345.mm.R.id.vc_, java.lang.Integer.valueOf(mo10731x2ee31f5b()));
                com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4888x58122b38.f21124x4fbc8495.m42578x75cba872(view);
            }
        }
        if (f537205d > 1 || !l() || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, "include") || (list = this.f537208c) == null) {
            return;
        }
        ((java.util.ArrayList) list).add(new xn5.c(this, name, xn5.d.f537193e, 0L, i17, 4, null));
    }

    public android.view.View e(android.content.Context ctx, android.util.AttributeSet attributeSet, java.lang.String name, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attributeSet, "attributeSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        return f(ctx, attributeSet, name, i17);
    }

    public abstract android.view.View f(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.String str, int i17);

    public final void g(android.content.Context ctx, android.view.View view, java.lang.String name, int i17) {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        if (view != null) {
            m(ctx, view, name);
        }
        if (f537205d > 1 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, "include") || (list = this.f537208c) == null) {
            return;
        }
        ((java.util.ArrayList) list).add(new xn5.c(this, name, xn5.d.f537193e, 0L, i17, 4, null));
    }

    public final android.view.View h(android.content.Context ctx, java.lang.String name, int i17) {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        if (f537205d <= 1 && l() && (list = this.f537208c) != null) {
            ((java.util.ArrayList) list).add(new xn5.c(this, name, null, 0L, i17, 6, null));
        }
        xn5.d0 a17 = xn5.q0.f537235a.b().a();
        android.view.View c17 = a17 != null ? ((xn5.q1) a17).c(ctx, name) : null;
        if (c17 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17.getTag(com.p314xaae8f345.mm.R.id.psb), 1)) {
            this.f537206a++;
        }
        return c17;
    }

    public final android.util.AttributeSet i() {
        xn5.p0 p0Var = xn5.q0.f537235a;
        return xn5.q0.f537238d;
    }

    public abstract java.lang.String j();

    public final float k(android.content.Context context, int i17) {
        float q17 = i65.a.q(context);
        return ((!com.p314xaae8f345.mm.ui.bk.M(q17, i65.a.u(context)) && !com.p314xaae8f345.mm.ui.bk.M(q17, i65.a.v(context))) || i17 == 1690268602 || i17 == -771693267 || i17 == 200122345 || i17 == 999067519 || i17 == -472572735 || i17 == -602931483 || i17 == -1992485345 || i17 == 1262601901 || i17 == 295445588) ? q17 : i65.a.t(context);
    }

    public final boolean l() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(android.content.Context ctx, android.view.View view, java.lang.String str) {
        ta5.h hVar = ta5.h.f498412a;
        int hashCode = str.hashCode();
        if (hashCode == -938935918 || hashCode == 2001146706 || hashCode == 1666676343 || hashCode == 1601505219 || hashCode == 776382189 || hashCode == 1125864064 || hashCode == -307023012 || hashCode == 742575657 || hashCode == -1455429095 || hashCode == 1690268602 || hashCode == 913567 || hashCode == -472572735 || hashCode == 295445588 || hashCode == -720637559 || hashCode == 625619963 || hashCode == -124208923 || hashCode == 310672300 || hashCode == 1524180521 || hashCode == -1299757303 || hashCode == -527895810 || hashCode == -1374364899 || hashCode == 132421285 || hashCode == 418111674 || hashCode == 540561289 || hashCode == 1079639440 || hashCode == 2077030397 || hashCode == 2076872964 || hashCode == -771693267 || hashCode == 200122345 || hashCode == 999067519 || hashCode == -1489232690 || hashCode == -1259604263 || hashCode == -1601904316 || hashCode == 1226216429 || hashCode == 960005444 || hashCode == -1568925917 || hashCode == -251296369 || hashCode == 687897231 || hashCode == -602931483 || hashCode == -1992485345 || hashCode == 1262601901 || hashCode == -455447493 || hashCode == 1215740217 || hashCode == -978427796 || hashCode == -602460368 || hashCode == -529817397 || hashCode == -1880646591) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
            if (view instanceof android.widget.TextView) {
                android.widget.TextView textView = (android.widget.TextView) view;
                float lineSpacingMultiplier = textView.getLineSpacingMultiplier();
                float lineSpacingExtra = textView.getLineSpacingExtra();
                if (lineSpacingMultiplier < 1.1d) {
                    if (lineSpacingExtra == 0.0f) {
                        textView.setLineSpacing(0.0f, 1.1f);
                    }
                }
            } else if (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view;
                if (c22624x85d69039.m84157x5274cf1a() < 1.1d) {
                    c22624x85d69039.k(0.0f, 1.1f);
                }
            } else if (view instanceof com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10808xd74620) {
                com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10808xd74620 c10808xd74620 = (com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10808xd74620) view;
                float m46325x5274cf1a = c10808xd74620.m46325x5274cf1a();
                float m46324x66610f17 = c10808xd74620.m46324x66610f17();
                if (m46325x5274cf1a < 1.1d) {
                    if (m46324x66610f17 == 0.0f) {
                        c10808xd74620.e(0.0f, 1.1f);
                    }
                }
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view.getTag(com.p314xaae8f345.mm.R.id.pse), 1)) {
                return;
            }
            float k17 = k(ctx, hashCode);
            if (hashCode == -938935918 || hashCode == 1690268602 || hashCode == 960005444 || hashCode == 2076872964 || hashCode == -251296369) {
                android.widget.TextView textView2 = (android.widget.TextView) view;
                float textSize = (textView2.getTextSize() * k17) / i65.a.g(ctx);
                textView2.setTextSize(1, textSize);
                if (hashCode == -251296369) {
                    p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.b(textView2, 1, (int) textSize, 1, 1);
                }
            } else if (hashCode == 2001146706 || hashCode == 687897231) {
                android.widget.Button button = (android.widget.Button) view;
                float textSize2 = (button.getTextSize() * k17) / i65.a.g(ctx);
                button.setTextSize(1, textSize2);
                if (hashCode == 687897231) {
                    p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.b(button, 1, (int) textSize2, 1, 1);
                }
            } else if (hashCode == 1666676343 || hashCode == 913567 || hashCode == -720637559 || hashCode == -124208923 || hashCode == 132421285 || hashCode == 310672300 || hashCode == 1524180521 || hashCode == -1489232690 || hashCode == 625619963 || hashCode == -978427796 || hashCode == -1880646591 || hashCode == -602460368 || hashCode == -529817397) {
                android.widget.EditText editText = (android.widget.EditText) view;
                editText.setTextSize(1, (editText.getTextSize() * k17) / i65.a.g(ctx));
            } else if (hashCode == -602931483 || hashCode == -1992485345 || hashCode == 1262601901) {
                fl5.i iVar = (fl5.i) view;
                iVar.mo81593x3abfd950(1, (iVar.mo81572x40077844() * k17) / i65.a.g(ctx));
            } else if (hashCode == 1601505219) {
                android.widget.CheckBox checkBox = (android.widget.CheckBox) view;
                checkBox.setTextSize(1, (checkBox.getTextSize() * k17) / i65.a.g(ctx));
            } else if (hashCode == -472572735) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view;
                c22624x85d690392.l(1, (c22624x85d690392.m84164x40077844() * k17) / i65.a.g(ctx));
            } else if (hashCode == -1568925917) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21519xe6b698c8 c21519xe6b698c8 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21519xe6b698c8) view;
                c21519xe6b698c8.m79152x3abfd950(c21519xe6b698c8.m79147x40077844() * k17);
            } else if (hashCode == 295445588) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22619x353059dc c22619x353059dc = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22619x353059dc) view;
                c22619x353059dc.J(1, (c22619x353059dc.m81341x40077844() * k17) / i65.a.g(ctx));
            } else if (view instanceof android.widget.TextView) {
                android.widget.TextView textView3 = (android.widget.TextView) view;
                textView3.setTextSize(1, (textView3.getTextSize() * k17) / i65.a.g(ctx));
            }
            jg5.c.f381198a.a(view, 1);
        }
    }

    public final void n() {
        java.util.List list;
        if (f537205d > 1 || !l() || (list = this.f537208c) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((xn5.c) it.next());
        }
        java.util.List V0 = kz5.n0.V0(arrayList);
        java.util.List list2 = this.f537208c;
        if (list2 != null) {
            ((java.util.ArrayList) list2).clear();
        }
        ((ku5.t0) ku5.t0.f394148d).g(new xn5.f(V0, this));
    }

    public final void o() {
        this.f537206a = 0;
        this.f537207b = 0;
        if (f537205d > 1 || !l()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f537208c = arrayList;
        arrayList.add(new xn5.c(this, "ViewCreate", null, 0L, 0, 14, null));
    }

    public final int p(android.content.Context ctx, android.view.View view, java.lang.String name, java.lang.String value, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        if (i17 == 0) {
            return android.graphics.Color.parseColor(value);
        }
        xn5.g0 c17 = xn5.q0.f537235a.b().c();
        if (c17 == null) {
            return i65.a.d(ctx, i17);
        }
        xn5.i1 i1Var = (xn5.i1) c17;
        java.lang.Object a17 = i1Var.a(i17);
        if (a17 != null) {
            java.lang.Integer num = a17 instanceof java.lang.Integer ? (java.lang.Integer) a17 : null;
            if (num != null) {
                int intValue = num.intValue();
                this.f537207b++;
                return intValue;
            }
        }
        int d17 = i65.a.d(ctx, i17);
        i1Var.b(i17, java.lang.Integer.valueOf(d17));
        return d17;
    }

    public final int q(android.content.Context ctx, android.view.View view, java.lang.String name, int i17, float f17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        if (i18 == 0) {
            return w(android.util.TypedValue.applyDimension(i17, f17, ctx.getResources().getDisplayMetrics()));
        }
        xn5.p0 p0Var = xn5.q0.f537235a;
        xn5.g0 c17 = p0Var.b().c();
        if (c17 == null) {
            return w(android.util.TypedValue.applyDimension(0, ctx.getResources().getDimension(i18), ctx.getResources().getDisplayMetrics()));
        }
        java.lang.Object a17 = ((xn5.i1) c17).a(i18);
        if (a17 != null) {
            java.lang.Float f18 = a17 instanceof java.lang.Float ? (java.lang.Float) a17 : null;
            if (f18 != null) {
                float floatValue = f18.floatValue();
                this.f537207b++;
                return w(android.util.TypedValue.applyDimension(0, floatValue, ctx.getResources().getDisplayMetrics()));
            }
        }
        float dimension = ctx.getResources().getDimension(i18);
        xn5.g0 c18 = p0Var.b().c();
        if (c18 != null) {
            ((xn5.i1) c18).b(i18, java.lang.Float.valueOf(dimension));
        }
        return w(android.util.TypedValue.applyDimension(0, dimension, ctx.getResources().getDisplayMetrics()));
    }

    public final android.graphics.drawable.Drawable r(android.content.Context ctx, android.view.View view, java.lang.String name, java.lang.String value, int i17) {
        android.graphics.drawable.Drawable newDrawable;
        android.graphics.drawable.Drawable newDrawable2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        if (r26.i0.y(value, "#", false) || r26.i0.y(value, "@color/", false) || r26.i0.y(value, "@android:color/", false)) {
            return new android.graphics.drawable.ColorDrawable(p(ctx, view, name, value, i17));
        }
        if (i17 == 0) {
            return null;
        }
        xn5.g0 c17 = xn5.q0.f537235a.b().c();
        if (c17 == null) {
            return i65.a.i(ctx, i17);
        }
        xn5.i1 i1Var = (xn5.i1) c17;
        java.lang.Object a17 = i1Var.a(i17);
        if (a17 != null) {
            android.graphics.drawable.Drawable drawable = a17 instanceof android.graphics.drawable.Drawable ? (android.graphics.drawable.Drawable) a17 : null;
            if (drawable != null) {
                this.f537207b++;
                android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
                return (constantState == null || (newDrawable2 = constantState.newDrawable()) == null) ? i65.a.i(ctx, i17) : newDrawable2;
            }
        }
        android.graphics.drawable.Drawable i18 = i65.a.i(ctx, i17);
        android.graphics.drawable.Drawable.ConstantState constantState2 = i18.getConstantState();
        if (constantState2 != null && (newDrawable = constantState2.newDrawable()) != null) {
            i1Var.b(i17, newDrawable);
        }
        return i18;
    }

    public final int s(android.content.Context ctx, android.view.View view, java.lang.String name, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        if (i18 == 0) {
            return i17;
        }
        xn5.g0 c17 = xn5.q0.f537235a.b().c();
        if (c17 == null) {
            return ctx.getResources().getInteger(i18);
        }
        xn5.i1 i1Var = (xn5.i1) c17;
        java.lang.Object a17 = i1Var.a(i18);
        if (a17 != null) {
            java.lang.Integer num = a17 instanceof java.lang.Integer ? (java.lang.Integer) a17 : null;
            if (num != null) {
                return num.intValue();
            }
        }
        int integer = ctx.getResources().getInteger(i18);
        i1Var.b(i18, java.lang.Integer.valueOf(integer));
        return integer;
    }

    public final java.lang.String t(android.content.Context ctx, android.view.View view, java.lang.String name, java.lang.String value, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        if (i17 == 0) {
            if (android.text.TextUtils.isEmpty(value)) {
                return value;
            }
            java.lang.String e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.p9.e(value);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "translate(...)");
            return e17;
        }
        xn5.g0 c17 = xn5.q0.f537235a.b().c();
        if (c17 == null) {
            java.lang.String string = ctx.getString(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        xn5.i1 i1Var = (xn5.i1) c17;
        java.lang.Object a17 = i1Var.a(i17);
        if (a17 != null) {
            java.lang.String str = a17 instanceof java.lang.String ? (java.lang.String) a17 : null;
            if (str != null) {
                this.f537207b++;
                return str;
            }
        }
        java.lang.String string2 = ctx.getString(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        i1Var.b(i17, string2);
        return string2;
    }

    public final float u(android.content.Context ctx, android.view.View view, java.lang.String name, int i17, float f17, int i18) {
        float dimension;
        float g17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        if (i18 == 0) {
            return f17;
        }
        view.setTag(com.p314xaae8f345.mm.R.id.pse, 1);
        float k17 = k(ctx, name.hashCode());
        xn5.p0 p0Var = xn5.q0.f537235a;
        xn5.g0 c17 = p0Var.b().c();
        if (c17 != null) {
            java.lang.Object a17 = ((xn5.i1) c17).a(i18);
            if (a17 != null) {
                java.lang.Float f18 = a17 instanceof java.lang.Float ? (java.lang.Float) a17 : null;
                if (f18 != null) {
                    float floatValue = f18.floatValue();
                    this.f537207b++;
                    dimension = k17 * floatValue;
                    g17 = i65.a.g(ctx);
                }
            }
            float dimension2 = ctx.getResources().getDimension(i18);
            xn5.g0 c18 = p0Var.b().c();
            if (c18 != null) {
                ((xn5.i1) c18).b(i18, java.lang.Float.valueOf(dimension2));
            }
            dimension = k17 * dimension2;
            g17 = i65.a.g(ctx);
        } else {
            dimension = k17 * ctx.getResources().getDimension(i18);
            g17 = i65.a.g(ctx);
        }
        return dimension / g17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0046, code lost:
    
        if (r6.equals("normal") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Typeface v(android.content.Context r3, android.view.View r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r2 = this;
            java.lang.String r0 = "ctx"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            java.lang.String r3 = "view"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r3)
            java.lang.String r3 = "name"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r3)
            java.lang.String r3 = "textStyleStr"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r3)
            java.lang.String r3 = "fontFamilyStr"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r3)
            java.lang.String r3 = "typeFaceStr"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r3)
            int r3 = r6.hashCode()
            r4 = -1178781136(0xffffffffb9bd3a30, float:-3.6092242E-4)
            java.lang.String r5 = "italic"
            java.lang.String r0 = "bold"
            r1 = 0
            if (r3 == r4) goto L49
            r4 = -1039745817(0xffffffffc206bce7, float:-33.684475)
            if (r3 == r4) goto L40
            r4 = 3029637(0x2e3a85, float:4.245426E-39)
            if (r3 == r4) goto L37
            goto L4f
        L37:
            boolean r3 = r6.equals(r0)
            if (r3 != 0) goto L3e
            goto L4f
        L3e:
            r1 = 1
            goto L5e
        L40:
            java.lang.String r3 = "normal"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L5e
            goto L4f
        L49:
            boolean r3 = r6.equals(r5)
            if (r3 != 0) goto L5d
        L4f:
            boolean r3 = r26.n0.B(r6, r0, r1)
            if (r3 == 0) goto L5e
            boolean r3 = r26.n0.B(r6, r5, r1)
            if (r3 == 0) goto L5e
            r1 = 3
            goto L5e
        L5d:
            r1 = 2
        L5e:
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r7)
            java.lang.String r4 = "create(...)"
            if (r3 != 0) goto L6e
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r7, r1)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)
            return r3
        L6e:
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r8)
            if (r3 != 0) goto Lb5
            int r3 = r8.hashCode()
            r5 = -1431958525(0xffffffffaaa60c03, float:-2.9495858E-13)
            if (r3 == r5) goto La0
            r5 = 3522707(0x35c093, float:4.936364E-39)
            if (r3 == r5) goto L94
            r5 = 109326717(0x684317d, float:4.97256E-35)
            if (r3 == r5) goto L88
            goto La8
        L88:
            java.lang.String r3 = "serif"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L91
            goto La8
        L91:
            android.graphics.Typeface r3 = android.graphics.Typeface.SERIF
            goto Lad
        L94:
            java.lang.String r3 = "sans"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L9d
            goto La8
        L9d:
            android.graphics.Typeface r3 = android.graphics.Typeface.SANS_SERIF
            goto Lad
        La0:
            java.lang.String r3 = "monospace"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto Lab
        La8:
            android.graphics.Typeface r3 = android.graphics.Typeface.DEFAULT
            goto Lad
        Lab:
            android.graphics.Typeface r3 = android.graphics.Typeface.MONOSPACE
        Lad:
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r1)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)
            return r3
        Lb5:
            android.graphics.Typeface r3 = android.graphics.Typeface.defaultFromStyle(r1)
            java.lang.String r4 = "defaultFromStyle(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xn5.g.v(android.content.Context, android.view.View, java.lang.String, java.lang.String, java.lang.String, java.lang.String):android.graphics.Typeface");
    }

    public final int w(float f17) {
        if (f17 < 1.0f && f17 >= 0.0f) {
            f17 = 1.0f;
        }
        return (int) f17;
    }
}
