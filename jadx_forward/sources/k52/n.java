package k52;

/* loaded from: classes15.dex */
public final class n implements yj0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k52.o f385849a;

    public n(k52.o oVar) {
        this.f385849a = oVar;
    }

    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "onTouch") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "(Landroid/view/View;Landroid/view/MotionEvent;)Z")) {
            k52.o oVar = this.f385849a;
            java.lang.ref.WeakReference weakReference = oVar.f385852c;
            android.view.View view = null;
            java.lang.Object[] objArr = weakReference != null ? (java.lang.Object[]) weakReference.get() : null;
            if (objArr == null) {
                return;
            }
            android.view.MotionEvent motionEvent = null;
            for (int length = objArr.length - 1; -1 < length; length--) {
                java.lang.Object obj3 = objArr[length];
                if (obj3 instanceof android.view.MotionEvent) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type android.view.MotionEvent");
                    motionEvent = (android.view.MotionEvent) obj3;
                } else if (obj3 instanceof android.view.View) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type android.view.View");
                    view = (android.view.View) obj3;
                }
                if (view != null && motionEvent != null) {
                    break;
                }
            }
            if (view == null || motionEvent == null || motionEvent.getAction() != 1) {
                return;
            }
            if (obj2 != null && (obj2 instanceof java.lang.Boolean) && ((java.lang.Boolean) obj2).booleanValue()) {
                oVar.f385853d = new android.util.Pair(view.getClass().getName(), obj != null ? obj.getClass().getName() : str);
                k52.o.a(oVar, view, str, obj, k52.g.f385827e);
                return;
            }
            boolean hasOnClickListeners = view.hasOnClickListeners();
            boolean z17 = (view instanceof android.widget.AdapterView) && ((android.widget.AdapterView) view).getOnItemClickListener() != null;
            if (hasOnClickListeners || z17) {
                return;
            }
            k52.o.a(oVar, view, str, obj, k52.g.f385827e);
        }
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        android.view.View view;
        if (objArr != null) {
            if (objArr.length == 0) {
                return;
            }
            java.lang.Object obj2 = objArr[0];
            if ((obj2 instanceof android.view.View) && objArr.length == 1) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type android.view.View");
                view = (android.view.View) obj2;
            } else {
                int length = objArr.length - 1;
                while (true) {
                    if (-1 >= length) {
                        view = null;
                        break;
                    }
                    java.lang.Object obj3 = objArr[length];
                    if (obj3 instanceof android.view.View) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type android.view.View");
                        view = (android.view.View) obj3;
                        break;
                    }
                    length--;
                }
            }
            if (view == null) {
                return;
            }
            k52.o oVar = this.f385849a;
            oVar.f385852c = null;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "onTouch") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "(Landroid/view/View;Landroid/view/MotionEvent;)Z")) {
                for (int length2 = objArr.length - 1; -1 < length2; length2--) {
                    java.lang.Object obj4 = objArr[length2];
                    if (obj4 instanceof android.view.MotionEvent) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type android.view.MotionEvent");
                        if (((android.view.MotionEvent) obj4).getAction() == 1) {
                            oVar.f385852c = new java.lang.ref.WeakReference(objArr);
                        }
                    }
                }
                return;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "onClick") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "(Landroid/view/View;)V")) {
                android.util.Pair pair = oVar.f385853d;
                java.lang.String str4 = pair != null ? (java.lang.String) pair.first : null;
                java.lang.String str5 = pair != null ? (java.lang.String) pair.second : null;
                if (str4 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, view.getClass().getName()) && str5 != null) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str5, str)) {
                        return;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str5, obj != null ? obj.getClass().getName() : null)) {
                        return;
                    }
                }
                k52.o.a(oVar, view, str, obj, k52.g.f385828f);
                return;
            }
            k52.g gVar = k52.g.f385828f;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("onDrag", str2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("(Landroid/view/View;Landroid/view/DragEvent;)Z", str3)) {
                gVar = k52.g.f385834o;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("onLongClick", str2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("(Landroid/view/View;)Z", str3)) {
                gVar = k52.g.f385829g;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("onKey", str2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("(Landroid/view/View;ILandroid/view/KeyEvent;)Z", str3)) {
                gVar = k52.g.f385835p;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("onHover", str2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("(Landroid/view/View;Landroid/view/MotionEvent;)Z", str3)) {
                gVar = k52.g.f385836q;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("onItemClick", str2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", str3)) {
                if (objArr.length > 1) {
                    java.lang.Object obj5 = objArr[1];
                    if (obj5 instanceof android.view.View) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj5, "null cannot be cast to non-null type android.view.View");
                        view = (android.view.View) obj5;
                    }
                }
                gVar = k52.g.f385831i;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("onItemLongClick", str2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", str3)) {
                gVar = k52.g.f385832m;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("onItemSelected", str2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", str3)) {
                gVar = k52.g.f385833n;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("onTouchEvent", str2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", str3)) {
                gVar = k52.g.f385827e;
            }
            if (!k52.c.f385817e) {
                k52.o.a(oVar, view, str, obj, gVar);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HABBYGE-MALI.ViewOpCallback", "gGestureFirst=TRUE");
                k52.c.f385817e = false;
            }
        }
    }
}
