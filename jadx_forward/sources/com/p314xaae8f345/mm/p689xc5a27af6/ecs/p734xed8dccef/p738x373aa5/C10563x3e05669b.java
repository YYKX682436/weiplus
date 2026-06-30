package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextLabelView;", "Landroid/widget/TextView;", "", "getMiddleIndex", "", "getCanBind", "()Z", "canBind", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView */
/* loaded from: classes9.dex */
public class C10563x3e05669b extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public bw5.a9 f147500d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10563x3e05669b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public static /* synthetic */ android.text.SpannableStringBuilder c(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p738x373aa5.C10563x3e05669b c10563x3e05669b, bw5.c9 c9Var, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createTextCharSequence");
        }
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        return c10563x3e05669b.b(c9Var, i17);
    }

    /* renamed from: getMiddleIndex */
    private final int m44412xf1b95b07() {
        bw5.a9 a9Var = this.f147500d;
        java.lang.Object obj = null;
        java.lang.Iterable iterable = a9Var != null ? a9Var.f106620d : null;
        if (iterable == null) {
            iterable = kz5.p0.f395529d;
        }
        java.util.Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((bw5.c9) next).f107514n != 0) {
                obj = next;
                break;
            }
        }
        if (obj == null) {
            return -1;
        }
        bw5.a9 a9Var2 = this.f147500d;
        if (!(a9Var2 != null && a9Var2.f106621e == 1)) {
            return -1;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a9Var2);
        java.util.LinkedList<bw5.c9> linkedList = a9Var2.f106620d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getTexts(...)");
        int i17 = 0;
        for (bw5.c9 c9Var : linkedList) {
            if (c9Var.f107514n == 0 && c9Var.f107515o == 0) {
                return i17;
            }
            i17++;
        }
        return -1;
    }

    public final void a(bw5.a9 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f147500d = item;
        if (m44413x5e89ebf7()) {
            int m44412xf1b95b07 = m44412xf1b95b07();
            int i17 = 0;
            java.util.LinkedList<bw5.c9> linkedList = item.f106620d;
            if (m44412xf1b95b07 < 0) {
                double d17 = item.f106622f;
                if (d17 > 0.0d) {
                    setLineSpacing(0.0f, (float) d17);
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getTexts(...)");
                int i18 = 0;
                for (bw5.c9 c9Var : linkedList) {
                    if (c9Var.f107515o == 1) {
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(c9Var.f107510g);
                        if (!(valueOf.intValue() > 0)) {
                            valueOf = null;
                        }
                        int intValue = valueOf != null ? valueOf.intValue() : 0;
                        if (intValue > i18) {
                            i18 = intValue;
                        }
                    }
                }
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getTexts(...)");
                for (java.lang.Object obj : linkedList) {
                    int i19 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    bw5.c9 c9Var2 = (bw5.c9) obj;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c9Var2);
                    spannableStringBuilder.append((java.lang.CharSequence) b(c9Var2, i18));
                    i17 = i19;
                }
                setText(spannableStringBuilder);
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getTexts(...)");
            java.util.ArrayList<bw5.c9> arrayList = new java.util.ArrayList();
            int i27 = 0;
            for (java.lang.Object obj2 : linkedList) {
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                if (i27 < m44412xf1b95b07) {
                    arrayList.add(obj2);
                }
                i27 = i28;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            for (bw5.c9 c9Var3 : arrayList) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c9Var3);
                arrayList2.add(c(this, c9Var3, 0, 2, null));
            }
            java.lang.Object obj3 = linkedList.get(m44412xf1b95b07);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
            android.text.SpannableStringBuilder c17 = c(this, (bw5.c9) obj3, 0, 2, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getTexts(...)");
            java.util.ArrayList<bw5.c9> arrayList3 = new java.util.ArrayList();
            int i29 = 0;
            for (java.lang.Object obj4 : linkedList) {
                int i37 = i29 + 1;
                if (i29 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                if (i29 > m44412xf1b95b07) {
                    arrayList3.add(obj4);
                }
                i29 = i37;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
            for (bw5.c9 c9Var4 : arrayList3) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c9Var4);
                arrayList4.add(c(this, c9Var4, 0, 2, null));
            }
            android.text.SpannableString spannableString = new android.text.SpannableString(" ");
            spannableString.setSpan(new s20.b(arrayList2, c17, arrayList4, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), getMaxLines() > 0 ? getMaxLines() : 1, (float) item.f106622f), 0, 1, 33);
            setText(spannableString);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.text.SpannableStringBuilder b(bw5.c9 text, int i17) {
        android.text.SpannableStringBuilder spannableStringBuilder;
        java.lang.String str;
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        int i18 = text.f107515o;
        bw5.m6 m6Var = null;
        if (i18 == 1) {
            spannableStringBuilder = new android.text.SpannableStringBuilder(" ");
            java.lang.Integer valueOf = java.lang.Integer.valueOf(text.f107510g);
            java.lang.Integer num = (valueOf.intValue() > 0) == true ? valueOf : null;
            int intValue = num != null ? num.intValue() : 12;
            bw5.c7 b17 = text.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getIcon(...)");
            spannableStringBuilder.setSpan(new s20.d(b17, es.h.a(getContext(), intValue), this), 0, 1, 33);
        } else if (i18 != 2) {
            str = "";
            if (i18 != 3) {
                java.lang.String m11655xfb85ada3 = text.m11655xfb85ada3();
                spannableStringBuilder = new android.text.SpannableStringBuilder(m11655xfb85ada3 != null ? m11655xfb85ada3 : "");
                android.content.Context context = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                spannableStringBuilder.setSpan(new s20.f(context, text, i17), 0, spannableStringBuilder.length(), 33);
            } else {
                int i19 = y02.u0.f540165d;
                y02.s0 s0Var = (y02.s0) p3380x6a61f93.p3387xf51c6630.C30630x21b82f67.m170394x21b0d463();
                if (s0Var != null) {
                    bw5.l6 l6Var = text.f107520t[13] ? text.f107519s : new bw5.l6();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l6Var, "getEncrypteSentence(...)");
                    byte[] mo14344x5f01b1f6 = l6Var.mo14344x5f01b1f6();
                    long m105978x2737f10 = ((y02.u0) s0Var).m105978x2737f10();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
                    m6Var = (bw5.m6) y02.k.c(p3380x6a61f93.p3387xf51c6630.C30630x21b82f67.m170403x21b9bae5(m105978x2737f10, mo14344x5f01b1f6), new bw5.m6());
                }
                if (m6Var != null && (linkedList = m6Var.f111625d) != null) {
                    str = kz5.n0.g0(linkedList, "", null, null, 0, null, r20.j.f450313d, 30, null);
                }
                spannableStringBuilder = new android.text.SpannableStringBuilder(str);
                android.content.Context context2 = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                spannableStringBuilder.setSpan(new s20.f(context2, text, i17), 0, spannableStringBuilder.length(), 33);
            }
        } else {
            spannableStringBuilder = new android.text.SpannableStringBuilder(" ");
            spannableStringBuilder.setSpan(new s20.e(es.h.a(getContext(), text.f107517q)), 0, 1, 33);
        }
        return spannableStringBuilder;
    }

    /* renamed from: getCanBind */
    public final boolean m44413x5e89ebf7() {
        return (getMeasuredWidth() > 0 || getMeasuredHeight() > 0) && isAttachedToWindow() && getVisibility() == 0 && this.f147500d != null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        bw5.a9 a9Var;
        super.onAttachedToWindow();
        if (!m44413x5e89ebf7() || (a9Var = this.f147500d) == null) {
            return;
        }
        a(a9Var);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        if (m44413x5e89ebf7()) {
            post(new r20.k(this));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(android.view.View changedView, int i17) {
        bw5.a9 a9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(changedView, "changedView");
        super.onVisibilityChanged(changedView, i17);
        if (!m44413x5e89ebf7() || (a9Var = this.f147500d) == null) {
            return;
        }
        a(a9Var);
    }

    public /* synthetic */ C10563x3e05669b(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10563x3e05669b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        setGravity(16);
        int maxLines = getMaxLines();
        if (!(1 <= maxLines && maxLines < 11)) {
            setMaxLines(1);
        }
        setEllipsize(android.text.TextUtils.TruncateAt.END);
        setIncludeFontPadding(false);
    }
}
