package fl5;

/* loaded from: classes5.dex */
public interface i {
    void a(nl5.p pVar);

    void addOnLayoutChangeListener(android.view.View.OnLayoutChangeListener onLayoutChangeListener);

    /* renamed from: addTextChangedListener */
    void mo81552xeb238c3a(android.text.TextWatcher textWatcher);

    /* renamed from: append */
    void mo81553xabe4cf1a(java.lang.CharSequence charSequence);

    void b(java.lang.String str, java.lang.String str2, nl5.a0 a0Var, nl5.w wVar);

    void c(fl5.g gVar);

    /* renamed from: clearComposingText */
    void mo81554x1b248a4f();

    void clearFocus();

    void d(boolean z17);

    /* renamed from: destroy */
    void mo81351x5cd39ffa();

    boolean e();

    void f();

    android.view.ViewParent g();

    java.lang.CharSequence getContentDescription();

    /* renamed from: getHint */
    java.lang.CharSequence mo81561xfb8046fd();

    /* renamed from: getImeOptions */
    int mo81562x56193393();

    /* renamed from: getInputConnection */
    android.view.inputmethod.InputConnection mo81352x6a67d012();

    /* renamed from: getInputExtras */
    android.os.Bundle mo81563xafeef997(boolean z17);

    /* renamed from: getInputType */
    int mo81564x652bd76e();

    /* renamed from: getLayout */
    android.text.Layout mo81565x22f21e20();

    /* renamed from: getLineCount */
    int mo81566x92d2fac5();

    /* renamed from: getMeasuredHeight */
    int m129680xd331a483();

    /* renamed from: getMinimumHeight */
    int m129681x411c071f();

    /* renamed from: getPaint */
    android.text.TextPaint mo81567x74f59ea8();

    /* renamed from: getPasterContent */
    java.lang.CharSequence mo81568xf23b5f84();

    /* renamed from: getPasterLen */
    int mo70737xc8d30aa0();

    /* renamed from: getRealEditText */
    fl5.i mo61840xc52e48b();

    /* renamed from: getSelectHelper */
    nl5.s0 mo81353xc6fc1640();

    /* renamed from: getSelectionStart */
    int mo81569x6f2c472c();

    /* renamed from: getSimilarPasteChange */
    boolean mo81570x8e20872e();

    /* renamed from: getSimilarPasteSeqStr */
    java.lang.String mo81571xa94aacd0();

    /* renamed from: getSizeAnimController */
    qa5.g mo81354x694fd8e4();

    /* renamed from: getTag */
    java.lang.Object m129682xb5887064(int i17);

    android.text.Editable getText();

    /* renamed from: getTextSize */
    float mo81572x40077844();

    int getVisibility();

    void h();

    int i();

    android.view.View j();

    boolean k();

    android.view.View l();

    /* renamed from: length */
    int mo81573xbe0e3ae6();

    void m(boolean z17);

    void n(java.lang.String str);

    void o();

    /* renamed from: onPause */
    void mo81355xb01dfb57();

    android.content.Context p();

    void q();

    void removeOnLayoutChangeListener(android.view.View.OnLayoutChangeListener onLayoutChangeListener);

    /* renamed from: removeTextChangedListener */
    void mo81574xf214c377(android.text.TextWatcher textWatcher);

    void setAlpha(float f17);

    /* renamed from: setBackListener */
    void mo81357xb8fce43d(al5.n1 n1Var);

    /* renamed from: setBreakStrategy */
    void mo81575xc08d1450(int i17);

    void setContentDescription(java.lang.CharSequence charSequence);

    /* renamed from: setCustomSelectionActionModeCallback */
    void mo81576x4d581497(android.view.ActionMode.Callback callback);

    /* renamed from: setEnableSendBtn */
    void mo81358x8f2956f(boolean z17);

    /* renamed from: setFilters */
    void mo81583x7e4f2d39(android.text.InputFilter[] inputFilterArr);

    /* renamed from: setHint */
    void mo81584x764b0e09(java.lang.CharSequence charSequence);

    /* renamed from: setImeOptions */
    void mo81585x843d819f(int i17);

    /* renamed from: setImeSendImageCallback */
    void mo81359xbbee6dd9(fl5.e eVar);

    /* renamed from: setInputListener */
    void mo81360xbf01395c(fl5.f fVar);

    /* renamed from: setInputType */
    void mo81586xc17f97e2(int i17);

    /* renamed from: setKeyCodeEnterListener */
    void mo81361xf1ab59a2(al5.q1 q1Var);

    /* renamed from: setMaxHeight */
    void mo81587x25bfb969(int i17);

    /* renamed from: setMaxLines */
    void mo81588x8dd5167d(int i17);

    /* renamed from: setMinHeight */
    void mo81589x53cacfd7(int i17);

    void setOnClickListener(android.view.View.OnClickListener onClickListener);

    void setOnDragListener(android.view.View.OnDragListener onDragListener);

    void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener);

    void setOnKeyListener(android.view.View.OnKeyListener onKeyListener);

    void setOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener);

    /* renamed from: setOnMsgPasteListener */
    void mo81362x7fcf1e67(fl5.c cVar);

    void setOnTouchListener(android.view.View.OnTouchListener onTouchListener);

    void setPadding(int i17, int i18, int i19, int i27);

    /* renamed from: setPasterLen */
    void mo70738x2526cb14(int i17);

    /* renamed from: setSelection */
    void mo81549xf579a34a(int i17);

    /* renamed from: setSelectionChangedListener */
    void mo81363xda276ede(fl5.h hVar);

    /* renamed from: setTag */
    void m129683xca0297d8(int i17, java.lang.Object obj);

    /* renamed from: setText */
    void mo81590x765074af(java.lang.CharSequence charSequence);

    /* renamed from: setTextColor */
    void mo81591x1c5c5ff4(int i17);

    /* renamed from: setTextCursorDrawable */
    void mo81592x372124a3(android.graphics.drawable.Drawable drawable);

    /* renamed from: setTextSize */
    void mo81593x3abfd950(int i17, float f17);

    void setVisibility(int i17);
}
