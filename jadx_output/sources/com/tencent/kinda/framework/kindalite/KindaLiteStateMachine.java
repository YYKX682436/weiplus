package com.tencent.kinda.framework.kindalite;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\tR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/KindaLiteStateMachine;", "", "Lcom/tencent/kinda/framework/kindalite/LiteEvent;", "event", "Ljz5/l;", "Lcom/tencent/kinda/framework/kindalite/KindaLiteAppState;", "", "Lcom/tencent/kinda/framework/kindalite/LiteEffect;", "reduce", "", "state", "Ljz5/f0;", "reportUnexpectedEventInState", "dispatch", "target", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "", "transitionTo", "Lkotlin/Function0;", "sessionIdProvider", "Lyz5/a;", "Lcom/tencent/kinda/framework/kindalite/KindaLiteEffects;", "effects", "Lcom/tencent/kinda/framework/kindalite/KindaLiteEffects;", "Lcom/tencent/kinda/framework/kindalite/KindaLiteAppState;", "getCurrent", "()Lcom/tencent/kinda/framework/kindalite/KindaLiteAppState;", "current", "<init>", "(Lyz5/a;Lcom/tencent/kinda/framework/kindalite/KindaLiteEffects;)V", "Companion", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class KindaLiteStateMachine {
    private static final java.lang.String TAG = "KindaLiteUseCase";
    private final com.tencent.kinda.framework.kindalite.KindaLiteEffects effects;
    private final yz5.a sessionIdProvider;
    private com.tencent.kinda.framework.kindalite.KindaLiteAppState state;

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.tencent.kinda.framework.kindalite.KindaLiteAppState.values().length];
            try {
                iArr[com.tencent.kinda.framework.kindalite.KindaLiteAppState.Idle.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.tencent.kinda.framework.kindalite.KindaLiteAppState.Starting.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.tencent.kinda.framework.kindalite.KindaLiteAppState.PendingStop.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.tencent.kinda.framework.kindalite.KindaLiteAppState.Running.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.tencent.kinda.framework.kindalite.KindaLiteAppState.Paying.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.tencent.kinda.framework.kindalite.KindaLiteAppState.PaySucceeded.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.tencent.kinda.framework.kindalite.KindaLiteAppState.Stopping.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.tencent.kinda.framework.kindalite.KindaLiteAppState.Stopped.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KindaLiteStateMachine(yz5.a sessionIdProvider, com.tencent.kinda.framework.kindalite.KindaLiteEffects effects) {
        kotlin.jvm.internal.o.g(sessionIdProvider, "sessionIdProvider");
        kotlin.jvm.internal.o.g(effects, "effects");
        this.sessionIdProvider = sessionIdProvider;
        this.effects = effects;
        this.state = com.tencent.kinda.framework.kindalite.KindaLiteAppState.Idle;
    }

    private final jz5.l reduce(com.tencent.kinda.framework.kindalite.LiteEvent event) {
        com.tencent.kinda.framework.kindalite.KindaLiteAppState state = getState();
        int i17 = com.tencent.kinda.framework.kindalite.KindaLiteStateMachine.WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        kz5.p0 p0Var = kz5.p0.f313996d;
        switch (i17) {
            case 1:
                if (event instanceof com.tencent.kinda.framework.kindalite.LiteEvent.StartRequested) {
                    com.tencent.kinda.framework.kindalite.LiteEvent.StartRequested startRequested = (com.tencent.kinda.framework.kindalite.LiteEvent.StartRequested) event;
                    return new jz5.l(com.tencent.kinda.framework.kindalite.KindaLiteAppState.Starting, kz5.b0.c(new com.tencent.kinda.framework.kindalite.LiteEffect.StartLiteApp(startRequested.getUrl(), startRequested.getData())));
                }
                if (kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.StopRequested.INSTANCE)) {
                    return new jz5.l(com.tencent.kinda.framework.kindalite.KindaLiteAppState.Stopped, kz5.b0.c(com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppStopped.INSTANCE));
                }
                reportUnexpectedEventInState("Idle", event);
                return new jz5.l(state, p0Var);
            case 2:
                if (kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.StopRequested.INSTANCE)) {
                    return new jz5.l(com.tencent.kinda.framework.kindalite.KindaLiteAppState.PendingStop, p0Var);
                }
                if (kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.JsRunning.INSTANCE)) {
                    return new jz5.l(com.tencent.kinda.framework.kindalite.KindaLiteAppState.Running, kz5.b0.c(com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppRunning.INSTANCE));
                }
                if (!kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.LiteAppDestroyed.INSTANCE) && !kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.StartFailed.INSTANCE) && !kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.StartCancelled.INSTANCE)) {
                    reportUnexpectedEventInState("Starting", event);
                    return new jz5.l(state, p0Var);
                }
                return new jz5.l(com.tencent.kinda.framework.kindalite.KindaLiteAppState.Stopped, kz5.b0.c(com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppStopped.INSTANCE));
            case 3:
                if (!kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.JsRunning.INSTANCE) && !kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.StopRequested.INSTANCE)) {
                    if (!kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.LiteAppDestroyed.INSTANCE) && !kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.StartFailed.INSTANCE) && !kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.StartCancelled.INSTANCE)) {
                        reportUnexpectedEventInState("PendingStop", event);
                        return new jz5.l(state, p0Var);
                    }
                    return new jz5.l(com.tencent.kinda.framework.kindalite.KindaLiteAppState.Stopped, kz5.b0.c(com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppStopped.INSTANCE));
                }
                return new jz5.l(com.tencent.kinda.framework.kindalite.KindaLiteAppState.Stopping, kz5.b0.c(com.tencent.kinda.framework.kindalite.LiteEffect.PublishStop.INSTANCE));
            case 4:
                if (kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.JsRunning.INSTANCE)) {
                    return new jz5.l(com.tencent.kinda.framework.kindalite.KindaLiteAppState.Running, p0Var);
                }
                if (kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.StopRequested.INSTANCE)) {
                    return new jz5.l(com.tencent.kinda.framework.kindalite.KindaLiteAppState.Stopping, kz5.b0.c(com.tencent.kinda.framework.kindalite.LiteEffect.PublishStop.INSTANCE));
                }
                if (kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.JsPaying.INSTANCE)) {
                    return new jz5.l(com.tencent.kinda.framework.kindalite.KindaLiteAppState.Paying, kz5.b0.c(com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppPaying.INSTANCE));
                }
                if (kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.JsPaySucceeded.INSTANCE)) {
                    return new jz5.l(com.tencent.kinda.framework.kindalite.KindaLiteAppState.PaySucceeded, kz5.b0.c(com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppPaySucceed.INSTANCE));
                }
                if (kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.LiteAppDestroyed.INSTANCE)) {
                    return new jz5.l(com.tencent.kinda.framework.kindalite.KindaLiteAppState.Stopped, kz5.b0.c(com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppStopped.INSTANCE));
                }
                reportUnexpectedEventInState("Running", event);
                return new jz5.l(state, p0Var);
            case 5:
                if (kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.JsPaying.INSTANCE)) {
                    return new jz5.l(com.tencent.kinda.framework.kindalite.KindaLiteAppState.Paying, p0Var);
                }
                if (kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.JsRunning.INSTANCE)) {
                    return new jz5.l(com.tencent.kinda.framework.kindalite.KindaLiteAppState.Running, kz5.b0.c(com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppRunning.INSTANCE));
                }
                if (kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.JsPaySucceeded.INSTANCE)) {
                    return new jz5.l(com.tencent.kinda.framework.kindalite.KindaLiteAppState.PaySucceeded, kz5.b0.c(com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppPaySucceed.INSTANCE));
                }
                if (kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.LiteAppDestroyed.INSTANCE)) {
                    return new jz5.l(com.tencent.kinda.framework.kindalite.KindaLiteAppState.Stopped, kz5.b0.c(com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppStopped.INSTANCE));
                }
                reportUnexpectedEventInState("Paying", event);
                return new jz5.l(state, p0Var);
            case 6:
                if (kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.JsPaySucceeded.INSTANCE)) {
                    return new jz5.l(com.tencent.kinda.framework.kindalite.KindaLiteAppState.PaySucceeded, p0Var);
                }
                if (kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.StopRequested.INSTANCE)) {
                    return new jz5.l(com.tencent.kinda.framework.kindalite.KindaLiteAppState.Stopping, kz5.b0.c(com.tencent.kinda.framework.kindalite.LiteEffect.PublishStop.INSTANCE));
                }
                if (kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.LiteAppDestroyed.INSTANCE)) {
                    return new jz5.l(com.tencent.kinda.framework.kindalite.KindaLiteAppState.Stopped, kz5.b0.c(com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppStopped.INSTANCE));
                }
                reportUnexpectedEventInState("PaySucceeded", event);
                return new jz5.l(state, p0Var);
            case 7:
                if (kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.StopRequested.INSTANCE)) {
                    return new jz5.l(com.tencent.kinda.framework.kindalite.KindaLiteAppState.Stopping, kz5.b0.c(com.tencent.kinda.framework.kindalite.LiteEffect.PublishStop.INSTANCE));
                }
                if (kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.LiteAppDestroyed.INSTANCE)) {
                    return new jz5.l(com.tencent.kinda.framework.kindalite.KindaLiteAppState.Stopped, kz5.b0.c(com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppStopped.INSTANCE));
                }
                reportUnexpectedEventInState("Stopping", event);
                return new jz5.l(state, p0Var);
            case 8:
                if (kotlin.jvm.internal.o.b(event, com.tencent.kinda.framework.kindalite.LiteEvent.StopRequested.INSTANCE)) {
                    return new jz5.l(com.tencent.kinda.framework.kindalite.KindaLiteAppState.Stopped, kz5.b0.c(com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppStopped.INSTANCE));
                }
                reportUnexpectedEventInState("Stopped", event);
                return new jz5.l(state, p0Var);
            default:
                throw new jz5.j();
        }
    }

    private final void reportUnexpectedEventInState(java.lang.String str, com.tencent.kinda.framework.kindalite.LiteEvent liteEvent) {
        java.lang.String str2 = str + " state: unexpected event " + liteEvent + " ignore";
        com.tencent.mars.xlog.Log.e("KindaLiteUseCase", str2);
        com.tencent.kinda.framework.kindalite.KindaLiteReportUtil.INSTANCE.report35075(new com.tencent.kinda.framework.kindalite.KindaLiteReportData35075(java.lang.String.valueOf(this.sessionIdProvider.invoke()), 0, 0, 0, 0, 0, null, null, 0, 0, 0, 38, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, 0, str2, null, 0, 0L, null, null, 2113927166, null));
    }

    public final void dispatch(com.tencent.kinda.framework.kindalite.LiteEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.kinda.framework.kindalite.KindaLiteAppState state = getState();
        com.tencent.mars.xlog.Log.i("KindaLiteUseCase", "dispatch event=" + event + " current=" + state + " sessionId=" + ((java.lang.String) this.sessionIdProvider.invoke()));
        jz5.l reduce = reduce(event);
        com.tencent.kinda.framework.kindalite.KindaLiteAppState kindaLiteAppState = (com.tencent.kinda.framework.kindalite.KindaLiteAppState) reduce.f302833d;
        java.util.List<com.tencent.kinda.framework.kindalite.LiteEffect> list = (java.util.List) reduce.f302834e;
        com.tencent.mars.xlog.Log.i("KindaLiteUseCase", "reduced target=" + kindaLiteAppState + " effects=" + kz5.n0.g0(list, null, null, null, 0, null, null, 63, null));
        if (!(kindaLiteAppState != getState() ? transitionTo(kindaLiteAppState, "dispatch(" + event + ')') : true)) {
            com.tencent.mars.xlog.Log.w("KindaLiteUseCase", "dispatch abort due to transition failure; event=" + event + " current=" + state + " target=" + kindaLiteAppState);
            return;
        }
        for (com.tencent.kinda.framework.kindalite.LiteEffect liteEffect : list) {
            if (liteEffect instanceof com.tencent.kinda.framework.kindalite.LiteEffect.StartLiteApp) {
                com.tencent.kinda.framework.kindalite.LiteEffect.StartLiteApp startLiteApp = (com.tencent.kinda.framework.kindalite.LiteEffect.StartLiteApp) liteEffect;
                this.effects.effectStartLiteApp(startLiteApp.getUrl(), startLiteApp.getData());
            } else if (kotlin.jvm.internal.o.b(liteEffect, com.tencent.kinda.framework.kindalite.LiteEffect.PublishStop.INSTANCE)) {
                this.effects.effectPublishStop();
            } else if (kotlin.jvm.internal.o.b(liteEffect, com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppStopped.INSTANCE)) {
                this.effects.effectOnLiteAppStopped();
            } else if (kotlin.jvm.internal.o.b(liteEffect, com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppRunning.INSTANCE)) {
                this.effects.effectOnLiteAppRunning();
            } else if (kotlin.jvm.internal.o.b(liteEffect, com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppPaying.INSTANCE)) {
                this.effects.effectOnLiteAppPaying();
            } else if (kotlin.jvm.internal.o.b(liteEffect, com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppPaySucceed.INSTANCE)) {
                this.effects.effectOnLiteAppPaySucceed();
            }
        }
    }

    /* renamed from: getCurrent, reason: from getter */
    public final com.tencent.kinda.framework.kindalite.KindaLiteAppState getState() {
        return this.state;
    }

    public final boolean transitionTo(com.tencent.kinda.framework.kindalite.KindaLiteAppState target, java.lang.String reason) {
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.kinda.framework.kindalite.KindaLiteAppState kindaLiteAppState = this.state;
        if (kindaLiteAppState == target) {
            com.tencent.mars.xlog.Log.i("KindaLiteUseCase", "noop transition: " + kindaLiteAppState + " -> " + target + ", reason: " + reason);
            return true;
        }
        com.tencent.mars.xlog.Log.i("KindaLiteUseCase", "state transition: " + kindaLiteAppState + " -> " + target + ", reason: " + reason);
        this.state = target;
        return true;
    }
}
