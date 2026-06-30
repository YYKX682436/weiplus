package a31;

/* loaded from: classes5.dex */
public final class h implements z21.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a31.m f957a;

    public h(a31.m mVar) {
        this.f957a = mVar;
    }

    @Override // z21.b
    public void a(java.lang.String[] lst, java.util.List voiceIdSet) {
        a31.n nVar;
        com.tencent.mm.pluginsdk.ui.v2 v2Var;
        kotlin.jvm.internal.o.g(lst, "lst");
        kotlin.jvm.internal.o.g(voiceIdSet, "voiceIdSet");
        java.lang.String d07 = kz5.z.d0(lst, "", null, null, 0, null, null, 62, null);
        kz5.z.z0(lst).toString();
        voiceIdSet.toString();
        if (d07.length() == 0) {
            return;
        }
        a31.m mVar = this.f957a;
        if (mVar.f971e) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout = mVar.f969c;
        if (speechInputLayout != null && (v2Var = speechInputLayout.f189830o) != null) {
            v2Var.d();
        }
        mVar.f990x = true;
        mVar.f991y = true;
        boolean z17 = mVar.E;
        a31.l lVar = mVar.O;
        com.tencent.mm.sdk.platformtools.n3 n3Var = mVar.f983q;
        if (z17 && mVar.f970d) {
            if (mVar.B.equals(d07)) {
                return;
            }
            n3Var.removeCallbacks(lVar);
            mVar.M = null;
            com.tencent.mm.ui.widget.MMEditText mMEditText = mVar.f968b;
            if (mMEditText != null) {
                a31.n[] nVarArr = (a31.n[]) mMEditText.getText().getSpans(0, mMEditText.getText().length(), a31.n.class);
                nVar = nVarArr != null ? (a31.n) kz5.z.O(nVarArr) : null;
                android.text.SpannableString spannableString = new android.text.SpannableString(d07);
                spannableString.setSpan(new a31.n(), 0, spannableString.length(), 33);
                if (nVar != null) {
                    int f17 = e06.p.f(mMEditText.getText().getSpanStart(nVar), 0, mMEditText.getText().length());
                    int f18 = e06.p.f(mMEditText.getText().getSpanEnd(nVar), f17, mMEditText.getText().length());
                    mVar.b(a31.n.class);
                    mMEditText.getText().replace(f17, f18, spannableString);
                    mVar.f988v = d07.length();
                    if (mVar.f989w) {
                        mMEditText.setSelection(mMEditText.getText().length());
                    } else {
                        mMEditText.setSelection(e06.p.f(f17 + d07.length(), 0, mMEditText.getText().length()));
                    }
                } else {
                    mMEditText.getText().replace(0, mMEditText.getText().length(), spannableString);
                    mVar.f988v = d07.length();
                    mMEditText.setSelection(mMEditText.getText().length());
                }
            }
            mVar.B = d07;
            return;
        }
        if (mVar.A) {
            return;
        }
        if ((z17 || !mVar.f970d) && !mVar.B.equals(d07)) {
            if (mVar.C > 0) {
                android.os.SystemClock.elapsedRealtime();
            }
            mVar.D = d07.length() - mVar.B.length() > 3 ? 40L : 60L;
            com.tencent.mm.ui.widget.MMEditText mMEditText2 = mVar.f968b;
            if (mMEditText2 != null) {
                a31.n[] nVarArr2 = (a31.n[]) mMEditText2.getText().getSpans(0, mMEditText2.getText().length(), a31.n.class);
                nVar = nVarArr2 != null ? (a31.n) kz5.z.O(nVarArr2) : null;
                int spanStart = mMEditText2.getText().getSpanStart(nVar);
                int spanEnd = mMEditText2.getText().getSpanEnd(nVar);
                mVar.b(a31.n.class);
                android.text.SpannableString spannableString2 = new android.text.SpannableString(d07);
                spannableString2.setSpan(new a31.n(), 0, spannableString2.length(), 33);
                int selectionEnd = android.text.Selection.getSelectionEnd(mMEditText2.getText());
                java.util.Objects.toString(mMEditText2.getText());
                if (selectionEnd == -1) {
                    selectionEnd = mMEditText2.getText().length();
                }
                int length = spannableString2.length();
                if (nVar == null) {
                    mVar.f988v = 0;
                    mVar.M = new a31.b(spannableString2, -1, selectionEnd);
                    n3Var.removeCallbacks(lVar);
                    mVar.e(0L);
                } else if (length > spanEnd - spanStart) {
                    mVar.M = new a31.b(spannableString2, spanStart, spanEnd);
                    n3Var.removeCallbacks(lVar);
                    mVar.e(0L);
                } else {
                    if (spanStart == -1 || spanEnd == -1) {
                        mMEditText2.getText().insert(selectionEnd, spannableString2);
                    } else {
                        mMEditText2.getText().replace(spanStart, spanEnd, spannableString2);
                    }
                    mVar.f988v = java.lang.Math.min(mVar.f988v, length);
                }
            }
            mVar.C = android.os.SystemClock.elapsedRealtime();
            mVar.B = d07;
        }
    }

    @Override // z21.b
    public void b(java.util.List list) {
    }

    @Override // z21.b
    public void c() {
        d75.b.g(new a31.g(this.f957a));
    }

    @Override // z21.b
    public void d(int i17) {
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout;
        com.tencent.mm.pluginsdk.ui.v2 v2Var;
        int i18;
        z21.j0 j0Var;
        a31.m mVar = this.f957a;
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout2 = mVar.f969c;
        int curV2TStatus = speechInputLayout2 != null ? speechInputLayout2.getCurV2TStatus() : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.SpeechInputHelper", "onRecognize Finish curV2TStatus:" + curV2TStatus + ", endFlag:" + i17);
        if (i17 == 1 && mVar.H > 0) {
            z21.w wVar = mVar.f985s;
            long j17 = (wVar == null || !wVar.C || (j0Var = wVar.A) == null) ? 0L : j0Var.f469632o;
            if (j17 <= 0) {
                j17 = android.os.SystemClock.elapsedRealtime();
            }
            mVar.I = j17 - mVar.H;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRecognizeFinish stopRecord->finish cost=");
            sb6.append(mVar.I);
            sb6.append("ms, workerBased=");
            sb6.append(j17 > 0);
            sb6.append(", isSending=");
            sb6.append(mVar.f971e);
            com.tencent.mars.xlog.Log.i("MicroMsg.SpeechInputHelper", sb6.toString());
            if (!mVar.f966J) {
                mVar.f966J = true;
                mVar.f983q.removeCallbacks(mVar.K);
                if (!mVar.f971e) {
                    b31.l.f17613a.g(mVar.G, true, mVar.I);
                }
                mVar.E = false;
            }
        }
        if (i17 == 2) {
            mVar.f971e = true;
        }
        if (curV2TStatus >= 2) {
            z21.w wVar2 = mVar.f985s;
            if (wVar2 != null) {
                if (i17 == 2) {
                    i18 = 100002;
                } else {
                    i18 = i17 == 3 ? com.tencent.thumbplayer.utils.TPGlobalEventNofication.EVENT_ID_UPC_CHANGED : 100001;
                }
                wVar2.e(i18);
            }
            com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout3 = mVar.f969c;
            if (speechInputLayout3 != null) {
                speechInputLayout3.c(1);
            }
            if (!(i17 == 2) || (speechInputLayout = mVar.f969c) == null || (v2Var = speechInputLayout.f189830o) == null) {
                return;
            }
            v2Var.b();
        }
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.SpeechInputHelper", "onError() called with: localCode = " + i17 + ", errType = " + i18 + ", errCode = " + i19 + ", voiceid = " + j17);
        d75.b.g(new a31.f(this.f957a, i17, i19, i18));
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
        a31.m mVar = this.f957a;
        if (mVar.f971e) {
            return;
        }
        mVar.A = z17;
        if (z17) {
            if (str == null) {
                str = "";
            }
            if (str.equals(mVar.B)) {
                return;
            }
            mVar.getClass();
            mVar.B = str;
            mVar.getClass();
            com.tencent.mm.ui.widget.MMEditText mMEditText = mVar.f968b;
            if (mMEditText != null) {
                mVar.b(a31.n.class);
                int length = mMEditText.getText().length();
                mVar.f988v = length;
                android.text.SpannableString spannableString = new android.text.SpannableString(mMEditText.getText());
                spannableString.setSpan(new a31.n(), 0, spannableString.length(), 33);
                mMEditText.getText().replace(0, mMEditText.getText().length(), spannableString);
                if (str.length() > 0) {
                    mVar.k(str, 0, length);
                } else {
                    mMEditText.setText("");
                }
            }
        }
    }

    @Override // z21.b
    public void g() {
    }
}
