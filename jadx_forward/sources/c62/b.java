package c62;

/* loaded from: classes15.dex */
public final class b implements yj0.d {
    public b(c62.a aVar) {
    }

    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        if ("com/tencent/mm/plugin/ball/view/FloatMenuView".equals(str)) {
            if ("show".equals(str2) && "(Landroid/animation/AnimatorListenerAdapter;)V".equals(str3)) {
                d52.d.a().d(208, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                return;
            } else {
                if ("hide".equals(str2) && "(Landroid/animation/AnimatorListenerAdapter;)V".equals(str3)) {
                    d52.d.a().d(211, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                    return;
                }
                return;
            }
        }
        if ("com/tencent/mm/plugin/ball/view/FloatBallView".equals(str)) {
            if ("onAttachedToWindow".equals(str2) && "()V".equals(str3)) {
                r45.n33 n33Var = new r45.n33();
                n33Var.f462575d = 5;
                d52.d.a().d(210, n33Var);
                return;
            } else if ("onDetachedFromWindow".equals(str2) && "()V".equals(str3)) {
                d52.d.a().d(212, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                return;
            } else {
                if ("show".equals(str2) && "(ZLandroid/animation/AnimatorListenerAdapter;)V".equals(str3)) {
                    r45.n33 n33Var2 = new r45.n33();
                    n33Var2.f462575d = 3;
                    d52.d.a().d(210, n33Var2);
                    return;
                }
                return;
            }
        }
        if ("onFloatMenuBackgroundClicked".equals(str2) && "()V".equals(str3)) {
            d52.d.a().c(213);
            return;
        }
        if ("onFloatMenuBackPressed".equals(str2) && "()V".equals(str3)) {
            d52.d.a().c(214);
            return;
        }
        if ("onFloatMenuItemClicked".equals(str2) && "(Lcom/tencent/mm/plugin/ball/model/BallInfo;)V".equals(str3)) {
            d52.d.a().c(215);
        } else if ("onFloatMenuItemRemoved".equals(str2) && "(Lcom/tencent/mm/plugin/ball/model/BallInfo;I)V".equals(str3)) {
            d52.d.a().c(216);
        }
    }
}
