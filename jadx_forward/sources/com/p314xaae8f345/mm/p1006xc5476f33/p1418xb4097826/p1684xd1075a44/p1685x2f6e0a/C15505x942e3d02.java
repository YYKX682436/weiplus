package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u000f¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/finder/widget/edit/FinderEditTextView;", "Landroid/widget/FrameLayout;", "", "maxLines", "Ljz5/f0;", "setTextMaxLines", "gravity", "setTextGravity", "type", "setTextInputType", "", "visible", "setTextCursorVisible", "resId", "setTextCursorDrawable", "", "hint", "setTextHint", "getText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.widget.edit.FinderEditTextView */
/* loaded from: classes5.dex */
public final class C15505x942e3d02 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f218480d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f218481e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15505x942e3d02(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f218480d = "Finder.FinderEditTextView";
        a();
    }

    public final void a() {
        this.f218481e = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017(getContext());
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        android.view.View view = this.f218481e;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
            throw null;
        }
        addView(view, layoutParams);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f218481e;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setBackground(null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
            throw null;
        }
    }

    /* renamed from: getText */
    public final java.lang.String m63438xfb85ada3() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f218481e;
        if (c22621x7603e017 != null) {
            return c22621x7603e017.getText().toString();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
        throw null;
    }

    /* renamed from: setTextCursorDrawable */
    public final void m63439x372124a3(int i17) {
        try {
            java.lang.reflect.Field declaredField = android.widget.TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f218481e;
            if (c22621x7603e017 != null) {
                declaredField.set(c22621x7603e017, java.lang.Integer.valueOf(i17));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
                throw null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f218480d, "set cursor drawable error %s", e17.getMessage());
        }
    }

    /* renamed from: setTextCursorVisible */
    public final void m63440x37f637cd(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f218481e;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setCursorVisible(z17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
            throw null;
        }
    }

    /* renamed from: setTextGravity */
    public final void m63441x4ee3c29f(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f218481e;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setGravity(i17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
            throw null;
        }
    }

    /* renamed from: setTextHint */
    public final void m63442x3abad7d6(java.lang.String hint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hint, "hint");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f218481e;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setHint(hint);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
            throw null;
        }
    }

    /* renamed from: setTextInputType */
    public final void m63443xc656e635(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f218481e;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setInputType(i17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
            throw null;
        }
    }

    /* renamed from: setTextMaxLines */
    public final void m63444x9e8131ca(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f218481e;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setMaxLines(i17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15505x942e3d02(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f218480d = "Finder.FinderEditTextView";
        a();
    }
}
