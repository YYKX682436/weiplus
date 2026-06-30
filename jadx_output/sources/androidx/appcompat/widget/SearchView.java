package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class SearchView extends androidx.appcompat.widget.LinearLayoutCompat implements n.c {
    public static final androidx.appcompat.widget.c2 F1 = new androidx.appcompat.widget.c2();
    public final android.widget.ImageView A;
    public android.app.SearchableInfo A1;
    public final android.widget.ImageView B;
    public android.os.Bundle B1;
    public final android.widget.ImageView C;
    public final java.lang.Runnable C1;
    public final android.view.View D;
    public final java.lang.Runnable D1;
    public androidx.appcompat.widget.i2 E;
    public final java.util.WeakHashMap E1;
    public final android.graphics.Rect F;
    public final android.graphics.Rect G;
    public final int[] H;
    public final int[] I;

    /* renamed from: J, reason: collision with root package name */
    public final android.widget.ImageView f9437J;
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
    public int f9438l1;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.CharSequence f9439p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f9440p1;

    /* renamed from: v, reason: collision with root package name */
    public final androidx.appcompat.widget.SearchView.SearchAutoComplete f9441v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f9442w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f9443x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f9444x0;

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.CharSequence f9445x1;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View f9446y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f9447y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f9448y1;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.ImageView f9449z;

    /* renamed from: z1, reason: collision with root package name */
    public int f9450z1;

    /* loaded from: classes13.dex */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.SearchView.SavedState> CREATOR = new androidx.appcompat.widget.g2();

        /* renamed from: f, reason: collision with root package name */
        public boolean f9451f;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9451f = ((java.lang.Boolean) parcel.readValue(null)).booleanValue();
        }

        public java.lang.String toString() {
            return "SearchView.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " isIconified=" + this.f9451f + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f11112d, i17);
            parcel.writeValue(java.lang.Boolean.valueOf(this.f9451f));
        }
    }

    /* loaded from: classes15.dex */
    public static class SearchAutoComplete extends androidx.appcompat.widget.AppCompatAutoCompleteTextView {

        /* renamed from: g, reason: collision with root package name */
        public int f9452g;

        /* renamed from: h, reason: collision with root package name */
        public androidx.appcompat.widget.SearchView f9453h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f9454i;

        /* renamed from: m, reason: collision with root package name */
        public final java.lang.Runnable f9455m;

        public SearchAutoComplete(android.content.Context context, android.util.AttributeSet attributeSet) {
            this(context, attributeSet, com.tencent.mm.R.attr.f478101ap);
        }

        private int getSearchViewTextMinWidthDp() {
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
            return this.f9452g <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
            android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f9454i) {
                java.lang.Runnable runnable = this.f9455m;
                removeCallbacks(runnable);
                post(runnable);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) android.util.TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z17, int i17, android.graphics.Rect rect) {
            super.onFocusChanged(z17, i17, rect);
            androidx.appcompat.widget.SearchView searchView = this.f9453h;
            searchView.y(searchView.U);
            searchView.post(searchView.C1);
            androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = searchView.f9441v;
            if (searchAutoComplete.hasFocus()) {
                androidx.appcompat.widget.c2 c2Var = androidx.appcompat.widget.SearchView.F1;
                java.lang.reflect.Method method = c2Var.f9537a;
                if (method != null) {
                    try {
                        method.invoke(searchAutoComplete, new java.lang.Object[0]);
                    } catch (java.lang.Exception unused) {
                    }
                }
                java.lang.reflect.Method method2 = c2Var.f9538b;
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
                        this.f9453h.clearFocus();
                        setImeVisibility(false);
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
            if (z17 && this.f9453h.hasFocus() && getVisibility() == 0) {
                this.f9454i = true;
                android.content.Context context = getContext();
                androidx.appcompat.widget.c2 c2Var = androidx.appcompat.widget.SearchView.F1;
                if (!(context.getResources().getConfiguration().orientation == 2) || (method = androidx.appcompat.widget.SearchView.F1.f9539c) == null) {
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

        public void setImeVisibility(boolean z17) {
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method");
            java.lang.Runnable runnable = this.f9455m;
            if (!z17) {
                this.f9454i = false;
                removeCallbacks(runnable);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f9454i = true;
                    return;
                }
                this.f9454i = false;
                removeCallbacks(runnable);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(androidx.appcompat.widget.SearchView searchView) {
            this.f9453h = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i17) {
            super.setThreshold(i17);
            this.f9452g = i17;
        }

        public SearchAutoComplete(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
            super(context, attributeSet, i17);
            this.f9455m = new androidx.appcompat.widget.h2(this);
            this.f9452g = getThreshold();
        }
    }

    public SearchView(android.content.Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479995l7);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479996l8);
    }

    private void setQuery(java.lang.CharSequence charSequence) {
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f9441v;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(android.text.TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // n.c
    public void b() {
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f9441v;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f9445x1 = "";
        clearFocus();
        y(true);
        searchAutoComplete.setImeOptions(this.f9450z1);
        this.f9448y1 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f9447y0 = true;
        super.clearFocus();
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f9441v;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f9447y0 = false;
    }

    @Override // n.c
    public void d() {
        if (this.f9448y1) {
            return;
        }
        this.f9448y1 = true;
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f9441v;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f9450z1 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    public int getImeOptions() {
        return this.f9441v.getImeOptions();
    }

    public int getInputType() {
        return this.f9441v.getInputType();
    }

    public int getMaxWidth() {
        return this.f9438l1;
    }

    public java.lang.CharSequence getQuery() {
        return this.f9441v.getText();
    }

    public java.lang.CharSequence getQueryHint() {
        java.lang.CharSequence charSequence = this.f9439p0;
        if (charSequence != null) {
            return charSequence;
        }
        android.app.SearchableInfo searchableInfo = this.A1;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.Q : getContext().getText(this.A1.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.M;
    }

    public int getSuggestionRowLayout() {
        return this.L;
    }

    public r3.c getSuggestionsAdapter() {
        return this.V;
    }

    public final android.content.Intent k(java.lang.String str, android.net.Uri uri, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        android.content.Intent intent = new android.content.Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f9445x1);
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
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f9441v;
        if (!android.text.TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.T) {
            clearFocus();
            y(true);
        }
    }

    public boolean o(int i17, int i18, java.lang.String str) {
        java.lang.String k17;
        android.database.Cursor cursor = this.V.f368927f;
        if (cursor != null && cursor.moveToPosition(i17)) {
            android.content.Intent intent = null;
            try {
                try {
                    int i19 = androidx.appcompat.widget.k2.E;
                    java.lang.String k18 = androidx.appcompat.widget.k2.k(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (k18 == null) {
                        k18 = this.A1.getSuggestIntentAction();
                    }
                    if (k18 == null) {
                        k18 = "android.intent.action.SEARCH";
                    }
                    java.lang.String str2 = k18;
                    java.lang.String k19 = androidx.appcompat.widget.k2.k(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (k19 == null) {
                        k19 = this.A1.getSuggestIntentData();
                    }
                    if (k19 != null && (k17 = androidx.appcompat.widget.k2.k(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        k19 = k19 + "/" + android.net.Uri.encode(k17);
                    }
                    intent = k(str2, k19 == null ? null : android.net.Uri.parse(k19), androidx.appcompat.widget.k2.k(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), androidx.appcompat.widget.k2.k(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, null);
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
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f9441v;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.C1);
        post(this.D1);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (z17) {
            androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f9441v;
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
            androidx.appcompat.widget.i2 i2Var = this.E;
            if (i2Var == null) {
                androidx.appcompat.widget.i2 i2Var2 = new androidx.appcompat.widget.i2(rect2, rect, searchAutoComplete);
                this.E = i2Var2;
                setTouchDelegate(i2Var2);
            } else {
                i2Var.f9608b.set(rect2);
                android.graphics.Rect rect3 = i2Var.f9610d;
                rect3.set(rect2);
                int i47 = -i2Var.f9611e;
                rect3.inset(i47, i47);
                i2Var.f9609c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        if (this.U) {
            super.onMeasure(i17, i18);
            return;
        }
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        if (mode == Integer.MIN_VALUE) {
            int i27 = this.f9438l1;
            size = i27 > 0 ? java.lang.Math.min(i27, size) : java.lang.Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f9438l1;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i19 = this.f9438l1) > 0) {
            size = java.lang.Math.min(i19, size);
        }
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = java.lang.Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof androidx.appcompat.widget.SearchView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.appcompat.widget.SearchView.SavedState savedState = (androidx.appcompat.widget.SearchView.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f11112d);
        y(savedState.f9451f);
        requestLayout();
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        androidx.appcompat.widget.SearchView.SavedState savedState = new androidx.appcompat.widget.SearchView.SavedState(super.onSaveInstanceState());
        savedState.f9451f = this.U;
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        post(this.C1);
    }

    public boolean p(int i17) {
        android.text.Editable text = this.f9441v.getText();
        android.database.Cursor cursor = this.V.f368927f;
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i17)) {
            setQuery(text);
            return true;
        }
        java.lang.CharSequence d17 = this.V.d(cursor);
        if (d17 != null) {
            setQuery(d17);
            return true;
        }
        setQuery(text);
        return true;
    }

    public void q(java.lang.CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i17, android.graphics.Rect rect) {
        if (this.f9447y0 || !isFocusable()) {
            return false;
        }
        if (this.U) {
            return super.requestFocus(i17, rect);
        }
        boolean requestFocus = this.f9441v.requestFocus(i17, rect);
        if (requestFocus) {
            y(false);
        }
        return requestFocus;
    }

    public void s() {
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f9441v;
        android.text.Editable text = searchAutoComplete.getText();
        if (text == null || android.text.TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.A1 != null) {
            m(0, null, text.toString());
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public void setAppSearchData(android.os.Bundle bundle) {
        this.B1 = bundle;
    }

    public void setIconified(boolean z17) {
        if (z17) {
            n();
            return;
        }
        y(false);
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f9441v;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        android.view.View.OnClickListener onClickListener = this.S;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z17) {
        if (this.T == z17) {
            return;
        }
        this.T = z17;
        y(z17);
        v();
    }

    public void setImeOptions(int i17) {
        this.f9441v.setImeOptions(i17);
    }

    public void setInputType(int i17) {
        this.f9441v.setInputType(i17);
    }

    public void setMaxWidth(int i17) {
        this.f9438l1 = i17;
        requestLayout();
    }

    public void setOnCloseListener(androidx.appcompat.widget.d2 d2Var) {
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.R = onFocusChangeListener;
    }

    public void setOnQueryTextListener(androidx.appcompat.widget.e2 e2Var) {
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener onClickListener) {
        this.S = onClickListener;
    }

    public void setOnSuggestionListener(androidx.appcompat.widget.f2 f2Var) {
    }

    public void setQueryHint(java.lang.CharSequence charSequence) {
        this.f9439p0 = charSequence;
        v();
    }

    public void setQueryRefinementEnabled(boolean z17) {
        this.f9444x0 = z17;
        r3.c cVar = this.V;
        if (cVar instanceof androidx.appcompat.widget.k2) {
            ((androidx.appcompat.widget.k2) cVar).f9633w = z17 ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r3, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSearchableInfo(android.app.SearchableInfo r8) {
        /*
            r7 = this;
            r7.A1 = r8
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r7.f9441v
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
            androidx.appcompat.widget.k2 r8 = (androidx.appcompat.widget.k2) r8
            boolean r4 = r7.f9444x0
            if (r4 == 0) goto L62
            r4 = 2
            goto L63
        L62:
            r4 = r1
        L63:
            r8.f9633w = r4
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
            r7.f9440p1 = r1
            if (r1 == 0) goto La2
            java.lang.String r8 = "nm"
            r0.setPrivateImeOptions(r8)
        La2:
            boolean r8 = r7.U
            r7.y(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z17) {
        this.W = z17;
        y(this.U);
    }

    public void setSuggestionsAdapter(r3.c cVar) {
        this.V = cVar;
        this.f9441v.setAdapter(cVar);
    }

    public final void t() {
        boolean z17 = true;
        boolean z18 = !android.text.TextUtils.isEmpty(this.f9441v.getText());
        if (!z18 && (!this.T || this.f9448y1)) {
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
        int[] iArr = this.f9441v.hasFocus() ? android.view.ViewGroup.FOCUSED_STATE_SET : android.view.ViewGroup.EMPTY_STATE_SET;
        android.graphics.drawable.Drawable background = this.f9443x.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        android.graphics.drawable.Drawable background2 = this.f9446y.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void v() {
        android.graphics.drawable.Drawable drawable;
        java.lang.CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z17 = this.T;
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.f9441v;
        if (z17 && (drawable = this.K) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new android.text.style.ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void w() {
        int i17 = (((this.W || this.f9440p1) && !this.U) && (this.A.getVisibility() == 0 || this.C.getVisibility() == 0)) ? 0 : 8;
        android.view.View view = this.f9446y;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/appcompat/widget/SearchView", "updateSubmitArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "androidx/appcompat/widget/SearchView", "updateSubmitArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r2.f9440p1 == false) goto L20;
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
            boolean r0 = r2.f9440p1
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
            boolean r3 = r2.f9440p1
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.A
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.x(boolean):void");
    }

    public final void y(boolean z17) {
        this.U = z17;
        int i17 = 8;
        int i18 = z17 ? 0 : 8;
        boolean z18 = !android.text.TextUtils.isEmpty(this.f9441v.getText());
        this.f9449z.setVisibility(i18);
        x(z18);
        android.view.View view = this.f9442w;
        int i19 = z17 ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/appcompat/widget/SearchView", "updateViewsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "androidx/appcompat/widget/SearchView", "updateViewsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView = this.f9437J;
        imageView.setVisibility((imageView.getDrawable() == null || this.T) ? 8 : 0);
        t();
        boolean z19 = !z18;
        if (this.f9440p1 && !this.U && z19) {
            this.A.setVisibility(8);
            i17 = 0;
        }
        this.C.setVisibility(i17);
        w();
    }

    public SearchView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478387ie);
    }

    public SearchView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.F = new android.graphics.Rect();
        this.G = new android.graphics.Rect();
        this.H = new int[2];
        this.I = new int[2];
        this.C1 = new androidx.appcompat.widget.t1(this);
        this.D1 = new androidx.appcompat.widget.u1(this);
        this.E1 = new java.util.WeakHashMap();
        androidx.appcompat.widget.x1 x1Var = new androidx.appcompat.widget.x1(this);
        androidx.appcompat.widget.y1 y1Var = new androidx.appcompat.widget.y1(this);
        androidx.appcompat.widget.z1 z1Var = new androidx.appcompat.widget.z1(this);
        androidx.appcompat.widget.a2 a2Var = new androidx.appcompat.widget.a2(this);
        androidx.appcompat.widget.b2 b2Var = new androidx.appcompat.widget.b2(this);
        androidx.appcompat.widget.s1 s1Var = new androidx.appcompat.widget.s1(this);
        androidx.appcompat.widget.q2 q2Var = new androidx.appcompat.widget.q2(context, context.obtainStyledAttributes(attributeSet, j.a.f296194v, i17, 0));
        android.view.LayoutInflater.from(context).inflate(q2Var.i(9, com.tencent.mm.R.layout.f487902b3), (android.view.ViewGroup) this, true);
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = (androidx.appcompat.widget.SearchView.SearchAutoComplete) findViewById(com.tencent.mm.R.id.mfj);
        this.f9441v = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f9442w = findViewById(com.tencent.mm.R.id.mdz);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mf8);
        this.f9443x = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f487162nr1);
        this.f9446y = findViewById2;
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.mdh);
        this.f9449z = imageView;
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486765me3);
        this.A = imageView2;
        android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.mdm);
        this.B = imageView3;
        android.widget.ImageView imageView4 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.mfp);
        this.C = imageView4;
        android.widget.ImageView imageView5 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.mev);
        this.f9437J = imageView5;
        android.graphics.drawable.Drawable e17 = q2Var.e(10);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.q(findViewById, e17);
        n3.u0.q(findViewById2, q2Var.e(14));
        imageView.setImageDrawable(q2Var.e(13));
        imageView2.setImageDrawable(q2Var.e(7));
        imageView3.setImageDrawable(q2Var.e(4));
        imageView4.setImageDrawable(q2Var.e(16));
        imageView5.setImageDrawable(q2Var.e(13));
        this.K = q2Var.e(12);
        androidx.appcompat.widget.a3.a(imageView, getResources().getString(com.tencent.mm.R.string.f489788bp));
        this.L = q2Var.i(15, com.tencent.mm.R.layout.f487901b2);
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
        searchAutoComplete.setOnFocusChangeListener(new androidx.appcompat.widget.v1(this));
        setIconifiedByDefault(q2Var.a(8, true));
        int d17 = q2Var.d(1, -1);
        if (d17 != -1) {
            setMaxWidth(d17);
        }
        this.Q = q2Var.j(6);
        this.f9439p0 = q2Var.j(11);
        int h17 = q2Var.h(3, -1);
        if (h17 != -1) {
            setImeOptions(h17);
        }
        int h18 = q2Var.h(2, -1);
        if (h18 != -1) {
            setInputType(h18);
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
            findViewById3.addOnLayoutChangeListener(new androidx.appcompat.widget.w1(this));
        }
        y(this.T);
        v();
    }
}
