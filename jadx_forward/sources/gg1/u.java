package gg1;

/* loaded from: classes7.dex */
public final class u implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.w f353163d;

    public u(gg1.w wVar) {
        this.f353163d = wVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        gg1.w wVar = this.f353163d;
        android.view.ViewTreeObserver viewTreeObserver = wVar.f353179s;
        if (viewTreeObserver != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewTreeObserver);
            if (!viewTreeObserver.isAlive()) {
                android.view.View view = wVar.f353178r;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                wVar.f353179s = view.getViewTreeObserver();
            }
            android.view.ViewTreeObserver viewTreeObserver2 = wVar.f353179s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewTreeObserver2);
            viewTreeObserver2.removeGlobalOnLayoutListener(wVar);
            wVar.f353179s = null;
        }
        wVar.f353183w.mo146xb9724478(java.lang.Integer.valueOf(wVar.f353168e.f353125e.size() + wVar.f353168e.f353124d.size()));
    }
}
