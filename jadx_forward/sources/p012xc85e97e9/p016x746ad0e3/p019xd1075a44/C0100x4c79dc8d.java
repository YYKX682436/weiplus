package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.SearchView */
/* loaded from: classes15.dex */
public class C0100x4c79dc8d extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 implements n.c {
    public static final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.c2 F1 = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.c2();
    public final android.widget.ImageView A;
    public android.app.SearchableInfo A1;
    public final android.widget.ImageView B;
    public android.os.Bundle B1;
    public final android.widget.ImageView C;
    public final java.lang.Runnable C1;
    public final android.view.View D;
    public final java.lang.Runnable D1;
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.i2 E;
    public final java.util.WeakHashMap E1;
    public final android.graphics.Rect F;
    public final android.graphics.Rect G;
    public final int[] H;
    public final int[] I;

    /* renamed from: J, reason: collision with root package name */
    public final android.widget.ImageView f90970J;
    public final android.graphics.drawable.Drawable K;
    public final int L;
    public final int M;
    public final android.content.Intent N;
    public final android.content.Intent P;
    public final java.lang.CharSequence Q;
    public android.view.View.OnFocusChangeListener R;
    public android.view.View.OnClickListener S;
    public boolean T;
    public boolean U;
    public r3.c V;
    public boolean W;

    /* renamed from: l1, reason: collision with root package name */
    public int f90971l1;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.CharSequence f90972p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f90973p1;

    /* renamed from: v, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SearchAutoComplete f90974v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f90975w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f90976x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f90977x0;

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.CharSequence f90978x1;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View f90979y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f90980y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f90981y1;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.ImageView f90982z;

    /* renamed from: z1, reason: collision with root package name */
    public int f90983z1;

    /* renamed from: androidx.appcompat.widget.SearchView$SavedState */
    /* loaded from: classes13.dex */
    public static class SavedState extends p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SavedState> f104x681a0c0c = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.g2();

        /* renamed from: f, reason: collision with root package name */
        public boolean f90984f;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f90984f = ((java.lang.Boolean) parcel.readValue(null)).booleanValue();
        }

        /* renamed from: toString */
        public java.lang.String m2765x9616526c() {
            return "SearchView.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " isIconified=" + this.f90984f + "}";
        }

        @Override // p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f92645d, i17);
            parcel.writeValue(java.lang.Boolean.valueOf(this.f90984f));
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete */
    /* loaded from: classes15.dex */
    public static class SearchAutoComplete extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0079x7da3871d {

        /* renamed from: g, reason: collision with root package name */
        public int f90985g;

        /* renamed from: h, reason: collision with root package name */
        public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d f90986h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f90987i;

        /* renamed from: m, reason: collision with root package name */
        public final java.lang.Runnable f90988m;

        public SearchAutoComplete(android.content.Context context, android.util.AttributeSet attributeSet) {
            this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559634ap);
        }

        /* renamed from: getSearchViewTextMinWidthDp */
        private int m2766x2b8b5690() {
            android.content.res.Configuration configuration = getResources().getConfiguration();
            int i17 = configuration.screenWidthDp;
            int i18 = configuration.screenHeightDp;
            if (i17 >= 960 && i18 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i17 < 600) {
                return (i17 < 640 || i18 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f90985g <= 0 || super.enoughToFilter();
        }

        @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0079x7da3871d, android.widget.TextView, android.view.View
        public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
            android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f90987i) {
                java.lang.Runnable runnable = this.f90988m;
                removeCallbacks(runnable);
                post(runnable);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) android.util.TypedValue.applyDimension(1, m2766x2b8b5690(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z17, int i17, android.graphics.Rect rect) {
            super.onFocusChanged(z17, i17, rect);
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d c0100x4c79dc8d = this.f90986h;
            c0100x4c79dc8d.y(c0100x4c79dc8d.U);
            c0100x4c79dc8d.post(c0100x4c79dc8d.C1);
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SearchAutoComplete searchAutoComplete = c0100x4c79dc8d.f90974v;
            if (searchAutoComplete.hasFocus()) {
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.c2 c2Var = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.F1;
                java.lang.reflect.Method method = c2Var.f91070a;
                if (method != null) {
                    try {
                        method.invoke(searchAutoComplete, new java.lang.Object[0]);
                    } catch (java.lang.Exception unused) {
                    }
                }
                java.lang.reflect.Method method2 = c2Var.f91071b;
                if (method2 != null) {
                    try {
                        method2.invoke(searchAutoComplete, new java.lang.Object[0]);
                    } catch (java.lang.Exception unused2) {
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i17, android.view.KeyEvent keyEvent) {
            if (i17 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    android.view.KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    android.view.KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f90986h.clearFocus();
                        m2767x1359fc71(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i17, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z17) {
            java.lang.reflect.Method method;
            super.onWindowFocusChanged(z17);
            if (z17 && this.f90986h.hasFocus() && getVisibility() == 0) {
                this.f90987i = true;
                android.content.Context context = getContext();
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.c2 c2Var = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.F1;
                if (!(context.getResources().getConfiguration().orientation == 2) || (method = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.F1.f91072c) == null) {
                    return;
                }
                try {
                    method.invoke(this, java.lang.Boolean.TRUE);
                } catch (java.lang.Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(java.lang.CharSequence charSequence) {
        }

        /* renamed from: setImeVisibility */
        public void m2767x1359fc71(boolean z17) {
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method");
            java.lang.Runnable runnable = this.f90988m;
            if (!z17) {
                this.f90987i = false;
                removeCallbacks(runnable);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f90987i = true;
                    return;
                }
                this.f90987i = false;
                removeCallbacks(runnable);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        /* renamed from: setSearchView */
        public void m2768xf20d066f(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d c0100x4c79dc8d) {
            this.f90986h = c0100x4c79dc8d;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i17) {
            super.setThreshold(i17);
            this.f90985g = i17;
        }

        public SearchAutoComplete(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
            super(context, attributeSet, i17);
            this.f90988m = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h2(this);
            this.f90985g = getThreshold();
        }
    }

    public C0100x4c79dc8d(android.content.Context context) {
        this(context, null);
    }

    /* renamed from: getPreferredHeight */
    private int m2737xa76936d2() {
        return getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561528l7);
    }

    /* renamed from: getPreferredWidth */
    private int m2738x8a5ca6bb() {
        return getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561529l8);
    }

    /* renamed from: setQuery */
    private void m2739x539ad986(java.lang.CharSequence charSequence) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SearchAutoComplete searchAutoComplete = this.f90974v;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(android.text.TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // n.c
    public void b() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SearchAutoComplete searchAutoComplete = this.f90974v;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f90978x1 = "";
        clearFocus();
        y(true);
        searchAutoComplete.setImeOptions(this.f90983z1);
        this.f90981y1 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f90980y0 = true;
        super.clearFocus();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SearchAutoComplete searchAutoComplete = this.f90974v;
        searchAutoComplete.clearFocus();
        searchAutoComplete.m2767x1359fc71(false);
        this.f90980y0 = false;
    }

    @Override // n.c
    public void d() {
        if (this.f90981y1) {
            return;
        }
        this.f90981y1 = true;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SearchAutoComplete searchAutoComplete = this.f90974v;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f90983z1 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432);
        searchAutoComplete.setText("");
        m2749x9677170(false);
    }

    /* renamed from: getImeOptions */
    public int m2740x56193393() {
        return this.f90974v.getImeOptions();
    }

    /* renamed from: getInputType */
    public int m2741x652bd76e() {
        return this.f90974v.getInputType();
    }

    /* renamed from: getMaxWidth */
    public int m2742x93b79438() {
        return this.f90971l1;
    }

    /* renamed from: getQuery */
    public java.lang.CharSequence m2743x750cbf12() {
        return this.f90974v.getText();
    }

    /* renamed from: getQueryHint */
    public java.lang.CharSequence m2744x93b538b9() {
        java.lang.CharSequence charSequence = this.f90972p0;
        if (charSequence != null) {
            return charSequence;
        }
        android.app.SearchableInfo searchableInfo = this.A1;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.Q : getContext().getText(this.A1.getHintId());
    }

    /* renamed from: getSuggestionCommitIconResId */
    public int m2745x4608f811() {
        return this.M;
    }

    /* renamed from: getSuggestionRowLayout */
    public int m2746x1b688cca() {
        return this.L;
    }

    /* renamed from: getSuggestionsAdapter */
    public r3.c m2747x61344b56() {
        return this.V;
    }

    public final android.content.Intent k(java.lang.String str, android.net.Uri uri, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        android.content.Intent intent = new android.content.Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f90978x1);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        android.os.Bundle bundle = this.B1;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i17 != 0) {
            intent.putExtra("action_key", i17);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.A1.getSearchActivity());
        return intent;
    }

    public final android.content.Intent l(android.content.Intent intent, android.app.SearchableInfo searchableInfo) {
        android.content.ComponentName searchActivity = searchableInfo.getSearchActivity();
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        android.os.Bundle bundle = new android.os.Bundle();
        android.os.Bundle bundle2 = this.B1;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        android.content.Intent intent3 = new android.content.Intent(intent);
        android.content.res.Resources resources = getResources();
        java.lang.String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        java.lang.String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        java.lang.String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public void m(int i17, java.lang.String str, java.lang.String str2) {
        android.content.Intent k17 = k("android.intent.action.SEARCH", null, null, str2, i17, str);
        android.content.Context context = getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(k17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "androidx/appcompat/widget/SearchView", "launchQuerySearch", "(ILjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "androidx/appcompat/widget/SearchView", "launchQuerySearch", "(ILjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void n() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SearchAutoComplete searchAutoComplete = this.f90974v;
        if (!android.text.TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.m2767x1359fc71(true);
        } else if (this.T) {
            clearFocus();
            y(true);
        }
    }

    public boolean o(int i17, int i18, java.lang.String str) {
        java.lang.String k17;
        android.database.Cursor cursor = this.V.f450460f;
        if (cursor != null && cursor.moveToPosition(i17)) {
            android.content.Intent intent = null;
            try {
                try {
                    int i19 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.k2.E;
                    java.lang.String k18 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.k2.k(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (k18 == null) {
                        k18 = this.A1.getSuggestIntentAction();
                    }
                    if (k18 == null) {
                        k18 = "android.intent.action.SEARCH";
                    }
                    java.lang.String str2 = k18;
                    java.lang.String k19 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.k2.k(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (k19 == null) {
                        k19 = this.A1.getSuggestIntentData();
                    }
                    if (k19 != null && (k17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.k2.k(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        k19 = k19 + "/" + android.net.Uri.encode(k17);
                    }
                    intent = k(str2, k19 == null ? null : android.net.Uri.parse(k19), p012xc85e97e9.p016x746ad0e3.p019xd1075a44.k2.k(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), p012xc85e97e9.p016x746ad0e3.p019xd1075a44.k2.k(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, null);
                } catch (java.lang.RuntimeException unused) {
                }
            } catch (java.lang.RuntimeException unused2) {
                cursor.getPosition();
            }
            if (intent != null) {
                try {
                    android.content.Context context = getContext();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "androidx/appcompat/widget/SearchView", "launchIntent", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "androidx/appcompat/widget/SearchView", "launchIntent", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (java.lang.RuntimeException unused3) {
                    intent.toString();
                }
            }
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SearchAutoComplete searchAutoComplete = this.f90974v;
        searchAutoComplete.m2767x1359fc71(false);
        searchAutoComplete.dismissDropDown();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.C1);
        post(this.D1);
        super.onDetachedFromWindow();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (z17) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SearchAutoComplete searchAutoComplete = this.f90974v;
            int[] iArr = this.H;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.I;
            getLocationInWindow(iArr2);
            int i28 = iArr[1] - iArr2[1];
            int i29 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i29;
            int height = searchAutoComplete.getHeight() + i28;
            android.graphics.Rect rect = this.F;
            rect.set(i29, i28, width, height);
            int i37 = rect.left;
            int i38 = rect.right;
            int i39 = i27 - i18;
            android.graphics.Rect rect2 = this.G;
            rect2.set(i37, 0, i38, i39);
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.i2 i2Var = this.E;
            if (i2Var == null) {
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.i2 i2Var2 = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.i2(rect2, rect, searchAutoComplete);
                this.E = i2Var2;
                setTouchDelegate(i2Var2);
            } else {
                i2Var.f91141b.set(rect2);
                android.graphics.Rect rect3 = i2Var.f91143d;
                rect3.set(rect2);
                int i47 = -i2Var.f91144e;
                rect3.inset(i47, i47);
                i2Var.f91142c.set(rect);
            }
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        if (this.U) {
            super.onMeasure(i17, i18);
            return;
        }
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        if (mode == Integer.MIN_VALUE) {
            int i27 = this.f90971l1;
            size = i27 > 0 ? java.lang.Math.min(i27, size) : java.lang.Math.min(m2738x8a5ca6bb(), size);
        } else if (mode == 0) {
            size = this.f90971l1;
            if (size <= 0) {
                size = m2738x8a5ca6bb();
            }
        } else if (mode == 1073741824 && (i19 = this.f90971l1) > 0) {
            size = java.lang.Math.min(i19, size);
        }
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = java.lang.Math.min(m2737xa76936d2(), size2);
        } else if (mode2 == 0) {
            size2 = m2737xa76936d2();
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SavedState savedState = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f92645d);
        y(savedState.f90984f);
        requestLayout();
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SavedState savedState = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SavedState(super.onSaveInstanceState());
        savedState.f90984f = this.U;
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        post(this.C1);
    }

    public boolean p(int i17) {
        android.text.Editable text = this.f90974v.getText();
        android.database.Cursor cursor = this.V.f450460f;
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i17)) {
            m2739x539ad986(text);
            return true;
        }
        java.lang.CharSequence d17 = this.V.d(cursor);
        if (d17 != null) {
            m2739x539ad986(d17);
            return true;
        }
        m2739x539ad986(text);
        return true;
    }

    public void q(java.lang.CharSequence charSequence) {
        m2739x539ad986(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i17, android.graphics.Rect rect) {
        if (this.f90980y0 || !isFocusable()) {
            return false;
        }
        if (this.U) {
            return super.requestFocus(i17, rect);
        }
        boolean requestFocus = this.f90974v.requestFocus(i17, rect);
        if (requestFocus) {
            y(false);
        }
        return requestFocus;
    }

    public void s() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SearchAutoComplete searchAutoComplete = this.f90974v;
        android.text.Editable text = searchAutoComplete.getText();
        if (text == null || android.text.TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.A1 != null) {
            m(0, null, text.toString());
        }
        searchAutoComplete.m2767x1359fc71(false);
        searchAutoComplete.dismissDropDown();
    }

    /* renamed from: setAppSearchData */
    public void m2748x7e13b931(android.os.Bundle bundle) {
        this.B1 = bundle;
    }

    /* renamed from: setIconified */
    public void m2749x9677170(boolean z17) {
        if (z17) {
            n();
            return;
        }
        y(false);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SearchAutoComplete searchAutoComplete = this.f90974v;
        searchAutoComplete.requestFocus();
        searchAutoComplete.m2767x1359fc71(true);
        android.view.View.OnClickListener onClickListener = this.S;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: setIconifiedByDefault */
    public void m2750xf7e86e5a(boolean z17) {
        if (this.T == z17) {
            return;
        }
        this.T = z17;
        y(z17);
        v();
    }

    /* renamed from: setImeOptions */
    public void m2751x843d819f(int i17) {
        this.f90974v.setImeOptions(i17);
    }

    /* renamed from: setInputType */
    public void m2752xc17f97e2(int i17) {
        this.f90974v.setInputType(i17);
    }

    /* renamed from: setMaxWidth */
    public void m2753x8e6ff544(int i17) {
        this.f90971l1 = i17;
        requestLayout();
    }

    /* renamed from: setOnCloseListener */
    public void m2754xe922de6b(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d2 d2Var) {
    }

    /* renamed from: setOnQueryTextFocusChangeListener */
    public void m2755x358a61a8(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.R = onFocusChangeListener;
    }

    /* renamed from: setOnQueryTextListener */
    public void m2756xf5bbda08(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.e2 e2Var) {
    }

    /* renamed from: setOnSearchClickListener */
    public void m2757x1ccefdf3(android.view.View.OnClickListener onClickListener) {
        this.S = onClickListener;
    }

    /* renamed from: setOnSuggestionListener */
    public void m2758x3d674a99(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.f2 f2Var) {
    }

    /* renamed from: setQueryHint */
    public void m2759xf008f92d(java.lang.CharSequence charSequence) {
        this.f90972p0 = charSequence;
        v();
    }

    /* renamed from: setQueryRefinementEnabled */
    public void m2760xfd7d4290(boolean z17) {
        this.f90977x0 = z17;
        r3.c cVar = this.V;
        if (cVar instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.k2) {
            ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.k2) cVar).f91166w = z17 ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r3, 65536) != null) goto L35;
     */
    /* renamed from: setSearchableInfo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m2761x8daea3d2(android.app.SearchableInfo r8) {
        /*
            r7 = this;
            r7.A1 = r8
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r7.f90974v
            r1 = 1
            r2 = 65536(0x10000, float:9.1835E-41)
            r3 = 0
            if (r8 == 0) goto L68
            int r8 = r8.getSuggestThreshold()
            r0.setThreshold(r8)
            android.app.SearchableInfo r8 = r7.A1
            int r8 = r8.getImeOptions()
            r0.setImeOptions(r8)
            android.app.SearchableInfo r8 = r7.A1
            int r8 = r8.getInputType()
            r4 = r8 & 15
            if (r4 != r1) goto L34
            r4 = -65537(0xfffffffffffeffff, float:NaN)
            r8 = r8 & r4
            android.app.SearchableInfo r4 = r7.A1
            java.lang.String r4 = r4.getSuggestAuthority()
            if (r4 == 0) goto L34
            r8 = r8 | r2
            r4 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 | r4
        L34:
            r0.setInputType(r8)
            r3.c r8 = r7.V
            if (r8 == 0) goto L3e
            r8.c(r3)
        L3e:
            android.app.SearchableInfo r8 = r7.A1
            java.lang.String r8 = r8.getSuggestAuthority()
            if (r8 == 0) goto L65
            androidx.appcompat.widget.k2 r8 = new androidx.appcompat.widget.k2
            android.content.Context r4 = r7.getContext()
            android.app.SearchableInfo r5 = r7.A1
            java.util.WeakHashMap r6 = r7.E1
            r8.<init>(r4, r7, r5, r6)
            r7.V = r8
            r0.setAdapter(r8)
            r3.c r8 = r7.V
            androidx.appcompat.widget.k2 r8 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.k2) r8
            boolean r4 = r7.f90977x0
            if (r4 == 0) goto L62
            r4 = 2
            goto L63
        L62:
            r4 = r1
        L63:
            r8.f91166w = r4
        L65:
            r7.v()
        L68:
            android.app.SearchableInfo r8 = r7.A1
            if (r8 == 0) goto L98
            boolean r8 = r8.getVoiceSearchEnabled()
            if (r8 == 0) goto L98
            android.app.SearchableInfo r8 = r7.A1
            boolean r8 = r8.getVoiceSearchLaunchWebSearch()
            if (r8 == 0) goto L7d
            android.content.Intent r3 = r7.N
            goto L87
        L7d:
            android.app.SearchableInfo r8 = r7.A1
            boolean r8 = r8.getVoiceSearchLaunchRecognizer()
            if (r8 == 0) goto L87
            android.content.Intent r3 = r7.P
        L87:
            if (r3 == 0) goto L98
            android.content.Context r8 = r7.getContext()
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            android.content.pm.ResolveInfo r8 = r8.resolveActivity(r3, r2)
            if (r8 == 0) goto L98
            goto L99
        L98:
            r1 = 0
        L99:
            r7.f90973p1 = r1
            if (r1 == 0) goto La2
            java.lang.String r8 = "nm"
            r0.setPrivateImeOptions(r8)
        La2:
            boolean r8 = r7.U
            r7.y(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.m2761x8daea3d2(android.app.SearchableInfo):void");
    }

    /* renamed from: setSubmitButtonEnabled */
    public void m2762x1ae152b5(boolean z17) {
        this.W = z17;
        y(this.U);
    }

    /* renamed from: setSuggestionsAdapter */
    public void m2763xf85fcd62(r3.c cVar) {
        this.V = cVar;
        this.f90974v.setAdapter(cVar);
    }

    public final void t() {
        boolean z17 = true;
        boolean z18 = !android.text.TextUtils.isEmpty(this.f90974v.getText());
        if (!z18 && (!this.T || this.f90981y1)) {
            z17 = false;
        }
        int i17 = z17 ? 0 : 8;
        android.widget.ImageView imageView = this.B;
        imageView.setVisibility(i17);
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z18 ? android.view.ViewGroup.ENABLED_STATE_SET : android.view.ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void u() {
        int[] iArr = this.f90974v.hasFocus() ? android.view.ViewGroup.FOCUSED_STATE_SET : android.view.ViewGroup.EMPTY_STATE_SET;
        android.graphics.drawable.Drawable background = this.f90976x.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        android.graphics.drawable.Drawable background2 = this.f90979y.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void v() {
        android.graphics.drawable.Drawable drawable;
        java.lang.CharSequence m2744x93b538b9 = m2744x93b538b9();
        if (m2744x93b538b9 == null) {
            m2744x93b538b9 = "";
        }
        boolean z17 = this.T;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SearchAutoComplete searchAutoComplete = this.f90974v;
        if (z17 && (drawable = this.K) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new android.text.style.ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(m2744x93b538b9);
            m2744x93b538b9 = spannableStringBuilder;
        }
        searchAutoComplete.setHint(m2744x93b538b9);
    }

    public final void w() {
        int i17 = (((this.W || this.f90973p1) && !this.U) && (this.A.getVisibility() == 0 || this.C.getVisibility() == 0)) ? 0 : 8;
        android.view.View view = this.f90979y;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/appcompat/widget/SearchView", "updateSubmitArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "androidx/appcompat/widget/SearchView", "updateSubmitArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r2.f90973p1 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.W
            if (r0 == 0) goto L21
            r1 = 0
            if (r0 != 0) goto Lb
            boolean r0 = r2.f90973p1
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.U
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.f90973p1
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.A
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.x(boolean):void");
    }

    public final void y(boolean z17) {
        this.U = z17;
        int i17 = 8;
        int i18 = z17 ? 0 : 8;
        boolean z18 = !android.text.TextUtils.isEmpty(this.f90974v.getText());
        this.f90982z.setVisibility(i18);
        x(z18);
        android.view.View view = this.f90975w;
        int i19 = z17 ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/appcompat/widget/SearchView", "updateViewsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "androidx/appcompat/widget/SearchView", "updateViewsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView = this.f90970J;
        imageView.setVisibility((imageView.getDrawable() == null || this.T) ? 8 : 0);
        t();
        boolean z19 = !z18;
        if (this.f90973p1 && !this.U && z19) {
            this.A.setVisibility(8);
            i17 = 0;
        }
        this.C.setVisibility(i17);
        w();
    }

    public C0100x4c79dc8d(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559920ie);
    }

    public C0100x4c79dc8d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.F = new android.graphics.Rect();
        this.G = new android.graphics.Rect();
        this.H = new int[2];
        this.I = new int[2];
        this.C1 = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t1(this);
        this.D1 = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.u1(this);
        this.E1 = new java.util.WeakHashMap();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x1 x1Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x1(this);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y1 y1Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y1(this);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z1 z1Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z1(this);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.a2 a2Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.a2(this);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b2 b2Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b2(this);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.s1 s1Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.s1(this);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2 q2Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2(context, context.obtainStyledAttributes(attributeSet, j.a.f377727v, i17, 0));
        android.view.LayoutInflater.from(context).inflate(q2Var.i(9, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569435b3), (android.view.ViewGroup) this, true);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SearchAutoComplete searchAutoComplete = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SearchAutoComplete) findViewById(com.p314xaae8f345.mm.R.id.mfj);
        this.f90974v = searchAutoComplete;
        searchAutoComplete.m2768xf20d066f(this);
        this.f90975w = findViewById(com.p314xaae8f345.mm.R.id.mdz);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.mf8);
        this.f90976x = findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f568695nr1);
        this.f90979y = findViewById2;
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.mdh);
        this.f90982z = imageView;
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f568298me3);
        this.A = imageView2;
        android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.mdm);
        this.B = imageView3;
        android.widget.ImageView imageView4 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.mfp);
        this.C = imageView4;
        android.widget.ImageView imageView5 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.mev);
        this.f90970J = imageView5;
        android.graphics.drawable.Drawable e17 = q2Var.e(10);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.q(findViewById, e17);
        n3.u0.q(findViewById2, q2Var.e(14));
        imageView.setImageDrawable(q2Var.e(13));
        imageView2.setImageDrawable(q2Var.e(7));
        imageView3.setImageDrawable(q2Var.e(4));
        imageView4.setImageDrawable(q2Var.e(16));
        imageView5.setImageDrawable(q2Var.e(13));
        this.K = q2Var.e(12);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.a3.a(imageView, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571321bp));
        this.L = q2Var.i(15, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569434b2);
        this.M = q2Var.i(5, 0);
        imageView.setOnClickListener(x1Var);
        imageView3.setOnClickListener(x1Var);
        imageView2.setOnClickListener(x1Var);
        imageView4.setOnClickListener(x1Var);
        searchAutoComplete.setOnClickListener(x1Var);
        searchAutoComplete.addTextChangedListener(s1Var);
        searchAutoComplete.setOnEditorActionListener(z1Var);
        searchAutoComplete.setOnItemClickListener(a2Var);
        searchAutoComplete.setOnItemSelectedListener(b2Var);
        searchAutoComplete.setOnKeyListener(y1Var);
        searchAutoComplete.setOnFocusChangeListener(new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.v1(this));
        m2750xf7e86e5a(q2Var.a(8, true));
        int d17 = q2Var.d(1, -1);
        if (d17 != -1) {
            m2753x8e6ff544(d17);
        }
        this.Q = q2Var.j(6);
        this.f90972p0 = q2Var.j(11);
        int h17 = q2Var.h(3, -1);
        if (h17 != -1) {
            m2751x843d819f(h17);
        }
        int h18 = q2Var.h(2, -1);
        if (h18 != -1) {
            m2752xc17f97e2(h18);
        }
        setFocusable(q2Var.a(0, true));
        q2Var.m();
        android.content.Intent intent = new android.content.Intent("android.speech.action.WEB_SEARCH");
        this.N = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        android.content.Intent intent2 = new android.content.Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.P = intent2;
        intent2.addFlags(268435456);
        android.view.View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.D = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.w1(this));
        }
        y(this.T);
        v();
    }
}
