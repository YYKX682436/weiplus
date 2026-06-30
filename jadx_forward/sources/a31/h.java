package a31;

/* loaded from: classes5.dex */
public final class h implements z21.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a31.m f82490a;

    public h(a31.m mVar) {
        this.f82490a = mVar;
    }

    @Override // z21.b
    public void a(java.lang.String[] lst, java.util.List voiceIdSet) {
        a31.n nVar;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.v2 v2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lst, "lst");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceIdSet, "voiceIdSet");
        java.lang.String d07 = kz5.z.d0(lst, "", null, null, 0, null, null, 62, null);
        kz5.z.z0(lst).toString();
        voiceIdSet.toString();
        if (d07.length() == 0) {
            return;
        }
        a31.m mVar = this.f82490a;
        if (mVar.f82504e) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d32 = mVar.f82502c;
        if (c19651x7fe9d32 != null && (v2Var = c19651x7fe9d32.f271363o) != null) {
            v2Var.d();
        }
        mVar.f82523x = true;
        mVar.f82524y = true;
        boolean z17 = mVar.E;
        a31.l lVar = mVar.O;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = mVar.f82516q;
        if (z17 && mVar.f82503d) {
            if (mVar.B.equals(d07)) {
                return;
            }
            n3Var.mo50300x3fa464aa(lVar);
            mVar.M = null;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = mVar.f82501b;
            if (c22621x7603e017 != null) {
                a31.n[] nVarArr = (a31.n[]) c22621x7603e017.getText().getSpans(0, c22621x7603e017.getText().length(), a31.n.class);
                nVar = nVarArr != null ? (a31.n) kz5.z.O(nVarArr) : null;
                android.text.SpannableString spannableString = new android.text.SpannableString(d07);
                spannableString.setSpan(new a31.n(), 0, spannableString.length(), 33);
                if (nVar != null) {
                    int f17 = e06.p.f(c22621x7603e017.getText().getSpanStart(nVar), 0, c22621x7603e017.getText().length());
                    int f18 = e06.p.f(c22621x7603e017.getText().getSpanEnd(nVar), f17, c22621x7603e017.getText().length());
                    mVar.b(a31.n.class);
                    c22621x7603e017.getText().replace(f17, f18, spannableString);
                    mVar.f82521v = d07.length();
                    if (mVar.f82522w) {
                        c22621x7603e017.mo81549xf579a34a(c22621x7603e017.getText().length());
                    } else {
                        c22621x7603e017.mo81549xf579a34a(e06.p.f(f17 + d07.length(), 0, c22621x7603e017.getText().length()));
                    }
                } else {
                    c22621x7603e017.getText().replace(0, c22621x7603e017.getText().length(), spannableString);
                    mVar.f82521v = d07.length();
                    c22621x7603e017.mo81549xf579a34a(c22621x7603e017.getText().length());
                }
            }
            mVar.B = d07;
            return;
        }
        if (mVar.A) {
            return;
        }
        if ((z17 || !mVar.f82503d) && !mVar.B.equals(d07)) {
            if (mVar.C > 0) {
                android.os.SystemClock.elapsedRealtime();
            }
            mVar.D = d07.length() - mVar.B.length() > 3 ? 40L : 60L;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = mVar.f82501b;
            if (c22621x7603e0172 != null) {
                a31.n[] nVarArr2 = (a31.n[]) c22621x7603e0172.getText().getSpans(0, c22621x7603e0172.getText().length(), a31.n.class);
                nVar = nVarArr2 != null ? (a31.n) kz5.z.O(nVarArr2) : null;
                int spanStart = c22621x7603e0172.getText().getSpanStart(nVar);
                int spanEnd = c22621x7603e0172.getText().getSpanEnd(nVar);
                mVar.b(a31.n.class);
                android.text.SpannableString spannableString2 = new android.text.SpannableString(d07);
                spannableString2.setSpan(new a31.n(), 0, spannableString2.length(), 33);
                int selectionEnd = android.text.Selection.getSelectionEnd(c22621x7603e0172.getText());
                java.util.Objects.toString(c22621x7603e0172.getText());
                if (selectionEnd == -1) {
                    selectionEnd = c22621x7603e0172.getText().length();
                }
                int length = spannableString2.length();
                if (nVar == null) {
                    mVar.f82521v = 0;
                    mVar.M = new a31.b(spannableString2, -1, selectionEnd);
                    n3Var.mo50300x3fa464aa(lVar);
                    mVar.e(0L);
                } else if (length > spanEnd - spanStart) {
                    mVar.M = new a31.b(spannableString2, spanStart, spanEnd);
                    n3Var.mo50300x3fa464aa(lVar);
                    mVar.e(0L);
                } else {
                    if (spanStart == -1 || spanEnd == -1) {
                        c22621x7603e0172.getText().insert(selectionEnd, spannableString2);
                    } else {
                        c22621x7603e0172.getText().replace(spanStart, spanEnd, spannableString2);
                    }
                    mVar.f82521v = java.lang.Math.min(mVar.f82521v, length);
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
        d75.b.g(new a31.g(this.f82490a));
    }

    @Override // z21.b
    public void d(int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d32;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.v2 v2Var;
        int i18;
        z21.j0 j0Var;
        a31.m mVar = this.f82490a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d322 = mVar.f82502c;
        int curV2TStatus = c19651x7fe9d322 != null ? c19651x7fe9d322.getCurV2TStatus() : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpeechInputHelper", "onRecognize Finish curV2TStatus:" + curV2TStatus + ", endFlag:" + i17);
        if (i17 == 1 && mVar.H > 0) {
            z21.w wVar = mVar.f82518s;
            long j17 = (wVar == null || !wVar.C || (j0Var = wVar.A) == null) ? 0L : j0Var.f551165o;
            if (j17 <= 0) {
                j17 = android.os.SystemClock.elapsedRealtime();
            }
            mVar.I = j17 - mVar.H;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRecognizeFinish stopRecord->finish cost=");
            sb6.append(mVar.I);
            sb6.append("ms, workerBased=");
            sb6.append(j17 > 0);
            sb6.append(", isSending=");
            sb6.append(mVar.f82504e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpeechInputHelper", sb6.toString());
            if (!mVar.f82499J) {
                mVar.f82499J = true;
                mVar.f82516q.mo50300x3fa464aa(mVar.K);
                if (!mVar.f82504e) {
                    b31.l.f99146a.g(mVar.G, true, mVar.I);
                }
                mVar.E = false;
            }
        }
        if (i17 == 2) {
            mVar.f82504e = true;
        }
        if (curV2TStatus >= 2) {
            z21.w wVar2 = mVar.f82518s;
            if (wVar2 != null) {
                if (i17 == 2) {
                    i18 = 100002;
                } else {
                    i18 = i17 == 3 ? com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.f55299x87635d9e : 100001;
                }
                wVar2.e(i18);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d323 = mVar.f82502c;
            if (c19651x7fe9d323 != null) {
                c19651x7fe9d323.c(1);
            }
            if (!(i17 == 2) || (c19651x7fe9d32 = mVar.f82502c) == null || (v2Var = c19651x7fe9d32.f271363o) == null) {
                return;
            }
            v2Var.b();
        }
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpeechInputHelper", "onError() called with: localCode = " + i17 + ", errType = " + i18 + ", errCode = " + i19 + ", voiceid = " + j17);
        d75.b.g(new a31.f(this.f82490a, i17, i19, i18));
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
        a31.m mVar = this.f82490a;
        if (mVar.f82504e) {
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
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = mVar.f82501b;
            if (c22621x7603e017 != null) {
                mVar.b(a31.n.class);
                int length = c22621x7603e017.getText().length();
                mVar.f82521v = length;
                android.text.SpannableString spannableString = new android.text.SpannableString(c22621x7603e017.getText());
                spannableString.setSpan(new a31.n(), 0, spannableString.length(), 33);
                c22621x7603e017.getText().replace(0, c22621x7603e017.getText().length(), spannableString);
                if (str.length() > 0) {
                    mVar.k(str, 0, length);
                } else {
                    c22621x7603e017.setText("");
                }
            }
        }
    }

    @Override // z21.b
    public void g() {
    }
}
