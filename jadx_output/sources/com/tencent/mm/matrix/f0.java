package com.tencent.mm.matrix;

/* loaded from: classes5.dex */
public final class f0 extends com.tencent.matrix.lifecycle.a {
    @Override // com.tencent.matrix.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("MicroMsg.OppoLeakFixer", "fixOplusCursorFeedbackManagerLeak");
        jz5.g gVar = com.tencent.mm.matrix.h0.f68715b;
        try {
            java.lang.Object[] objArr = (java.lang.Object[]) ((jz5.n) com.tencent.mm.matrix.h0.f68715b).getValue();
            int length = objArr.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    i17 = -1;
                    obj = null;
                    break;
                } else {
                    obj = objArr[i17];
                    if (kotlin.jvm.internal.o.b(obj != null ? obj.getClass().getName() : null, "android.widget.OplusCursorFeedbackManager")) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            if (obj == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OppoLeakFixer", "OplusCursorFeedbackManager instance not found");
            } else {
                if (java.lang.System.currentTimeMillis() - com.tencent.mm.matrix.h0.f68714a < java.util.concurrent.TimeUnit.MINUTES.toMillis(1L)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OppoLeakFixer", "skip for freq");
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.OppoLeakFixer", "fix Oplus leak");
                com.tencent.mm.matrix.h0.f68714a = java.lang.System.currentTimeMillis();
                ((java.lang.Object[]) ((jz5.n) com.tencent.mm.matrix.h0.f68715b).getValue())[i17] = null;
            }
        } catch (java.lang.ClassNotFoundException e17) {
            oj.j.d("MicroMsg.OppoLeakFixer", e17, "", new java.lang.Object[0]);
        } catch (java.lang.NoSuchFieldException e18) {
            oj.j.d("MicroMsg.OppoLeakFixer", e18, "", new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.OppoLeakFixer", th6, "", new java.lang.Object[0]);
        }
    }
}
