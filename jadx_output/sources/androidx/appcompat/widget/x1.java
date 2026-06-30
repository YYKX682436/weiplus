package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f9735d;

    public x1(androidx.appcompat.widget.SearchView searchView) {
        this.f9735d = searchView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        androidx.appcompat.widget.SearchView searchView = this.f9735d;
        android.widget.ImageView imageView = searchView.f9449z;
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = searchView.f9441v;
        if (view == imageView) {
            searchView.y(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            android.view.View.OnClickListener onClickListener = searchView.S;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.B) {
            searchView.n();
            return;
        }
        if (view == searchView.A) {
            searchView.s();
            return;
        }
        if (view != searchView.C) {
            if (view == searchAutoComplete) {
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
                    method2.invoke(searchAutoComplete, new java.lang.Object[0]);
                }
                return;
            }
            return;
        }
        android.app.SearchableInfo searchableInfo = searchView.A1;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    android.content.Intent intent = new android.content.Intent(searchView.N);
                    android.content.ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    android.content.Context context = searchView.getContext();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "androidx/appcompat/widget/SearchView", "onVoiceClicked", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "androidx/appcompat/widget/SearchView", "onVoiceClicked", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                }
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    android.content.Intent l17 = searchView.l(searchView.P, searchableInfo);
                    android.content.Context context2 = searchView.getContext();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(l17);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(context2, arrayList2.toArray(), "androidx/appcompat/widget/SearchView", "onVoiceClicked", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context2, "androidx/appcompat/widget/SearchView", "onVoiceClicked", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } catch (android.content.ActivityNotFoundException | java.lang.Exception unused2) {
            }
        }
    }
}
