package com.tencent.matrix.resource;

/* loaded from: classes15.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static android.util.Pair f52937a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f52938b;

    public static void a(android.view.ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            b(viewGroup.getChildAt(i17));
        }
    }

    public static void b(android.view.View view) {
        android.widget.LinearLayout linearLayout;
        android.graphics.drawable.Drawable dividerDrawable;
        android.widget.FrameLayout frameLayout;
        android.graphics.drawable.Drawable foreground;
        if (view == null || view.getContext() == null) {
            return;
        }
        boolean isClickable = view.isClickable();
        boolean isLongClickable = view.isLongClickable();
        try {
            view.setOnClickListener(null);
        } catch (java.lang.Throwable unused) {
        }
        try {
            view.setOnCreateContextMenuListener(null);
        } catch (java.lang.Throwable unused2) {
        }
        try {
            view.setOnFocusChangeListener(null);
        } catch (java.lang.Throwable unused3) {
        }
        try {
            view.setOnKeyListener(null);
        } catch (java.lang.Throwable unused4) {
        }
        try {
            view.setOnLongClickListener(null);
        } catch (java.lang.Throwable unused5) {
        }
        try {
            view.setOnClickListener(null);
        } catch (java.lang.Throwable unused6) {
        }
        try {
            view.setOnTouchListener(null);
        } catch (java.lang.Throwable unused7) {
        }
        if (view.getBackground() != null) {
            view.addOnAttachStateChangeListener(new com.tencent.matrix.resource.a());
        }
        view.setClickable(isClickable);
        view.setLongClickable(isLongClickable);
        if (view instanceof android.widget.ImageView) {
            android.widget.ImageView imageView = (android.widget.ImageView) view;
            android.graphics.drawable.Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setCallback(null);
            }
            imageView.setImageDrawable(null);
        }
        if (view instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) view;
            for (android.graphics.drawable.Drawable drawable2 : textView.getCompoundDrawables()) {
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
            }
            textView.setCompoundDrawables(null, null, null, null);
            textView.setOnEditorActionListener(null);
            textView.setKeyListener(null);
            textView.setMovementMethod(null);
            if (textView instanceof android.widget.EditText) {
                try {
                    textView.setHint("");
                    java.lang.reflect.Field declaredField = android.widget.TextView.class.getDeclaredField("mListeners");
                    declaredField.setAccessible(true);
                    java.lang.Object obj = declaredField.get(textView);
                    if (obj instanceof java.util.ArrayList) {
                        ((java.util.ArrayList) obj).clear();
                    }
                } catch (java.lang.Throwable unused8) {
                }
            }
        }
        if (view instanceof android.widget.ProgressBar) {
            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) view;
            android.graphics.drawable.Drawable progressDrawable = progressBar.getProgressDrawable();
            if (progressDrawable != null) {
                progressBar.setProgressDrawable(null);
                progressDrawable.setCallback(null);
            }
            android.graphics.drawable.Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                progressBar.setIndeterminateDrawable(null);
                indeterminateDrawable.setCallback(null);
            }
        }
        if (view instanceof android.widget.ListView) {
            android.widget.ListView listView = (android.widget.ListView) view;
            android.graphics.drawable.Drawable selector = listView.getSelector();
            if (selector != null) {
                selector.setCallback(null);
            }
            try {
                if (listView.getAdapter() != null) {
                    listView.setAdapter((android.widget.ListAdapter) null);
                }
            } catch (java.lang.Throwable unused9) {
            }
            try {
                listView.setOnScrollListener(null);
            } catch (java.lang.Throwable unused10) {
            }
            try {
                listView.setOnItemClickListener(null);
            } catch (java.lang.Throwable unused11) {
            }
            try {
                listView.setOnItemLongClickListener(null);
            } catch (java.lang.Throwable unused12) {
            }
            try {
                listView.setOnItemSelectedListener(null);
            } catch (java.lang.Throwable unused13) {
            }
        }
        if ((view instanceof android.widget.FrameLayout) && (foreground = (frameLayout = (android.widget.FrameLayout) view).getForeground()) != null) {
            foreground.setCallback(null);
            frameLayout.setForeground(null);
        }
        if ((view instanceof android.widget.LinearLayout) && (dividerDrawable = (linearLayout = (android.widget.LinearLayout) view).getDividerDrawable()) != null) {
            dividerDrawable.setCallback(null);
            linearLayout.setDividerDrawable(null);
        }
        if (view instanceof android.view.ViewGroup) {
            a((android.view.ViewGroup) view);
        }
    }
}
