package ey5;

/* loaded from: classes13.dex */
public class e implements com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a f339179a;

    /* renamed from: b, reason: collision with root package name */
    public final ey5.r f339180b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26062x676db5b8 f339181c;

    public e(ey5.r rVar, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a) {
        this.f339180b = rVar;
        this.f339179a = interfaceC26059x88f1805a;
        if (rVar == null || rVar.f339197f == null) {
            return;
        }
        synchronized (ey5.e.class) {
            ((java.util.ArrayList) rVar.f339197f).add(interfaceC26059x88f1805a);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: addCollisionUnit */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26062x676db5b8 mo37227x5ead30b5(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            return interfaceC26059x88f1805a.mo36430x5ead30b5(c26064xea4764e4);
        }
        return null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: getAlpha */
    public float mo37230x742757a8() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            return interfaceC26059x88f1805a.mo36432x742757a8();
        }
        return 0.0f;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: getContentDescription */
    public java.lang.String mo37231xc77303b9() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            return interfaceC26059x88f1805a.mo36435xc77303b9();
        }
        return null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4400xc162a7c7
    /* renamed from: getId */
    public java.lang.String mo37116x5db1b11() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        return interfaceC26059x88f1805a != null ? interfaceC26059x88f1805a.mo36409x5db1b11() : "";
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: getLevel */
    public int mo37232x74bf41ce() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            return interfaceC26059x88f1805a.mo36418x74bf41ce();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: getMarkerView */
    public android.view.View mo37233x30bd4df5() {
        return null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: getPosition */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 mo37234xa86cd69f() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            return ey5.x.a(interfaceC26059x88f1805a.mo36440xa86cd69f());
        }
        return null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: getRotation */
    public float mo37235x79734cf4() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            return interfaceC26059x88f1805a.mo36441x79734cf4();
        }
        return 0.0f;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: getSnippet */
    public java.lang.String mo37236xc2eb2ce7() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            return interfaceC26059x88f1805a.mo36443xc2eb2ce7();
        }
        return null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: getTag */
    public java.lang.Object mo37237xb5887064() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            return interfaceC26059x88f1805a.mo36399xb5887064();
        }
        return null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: getTitle */
    public java.lang.String mo37238x7531c8a2() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            return interfaceC26059x88f1805a.mo36446x7531c8a2();
        }
        return null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: getZIndex */
    public float mo37239x397e976e() {
        if (this.f339179a != null) {
            return r0.mo36420x397e976e();
        }
        return 0.0f;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: hideInfoWindow */
    public void mo37241xa1cc0120() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            interfaceC26059x88f1805a.mo36449xa1cc0120();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: isDraggable */
    public boolean mo37242x34173f83() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            return interfaceC26059x88f1805a.mo36451x34173f83();
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: isInfoWindowShown */
    public boolean mo37243x4a284ae9() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            return interfaceC26059x88f1805a.mo36454x4a284ae9();
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4400xc162a7c7
    /* renamed from: isVisible */
    public boolean mo37125xf94337e8() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            return interfaceC26059x88f1805a.mo36423xf94337e8();
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: refreshInfoWindow */
    public void mo37244xa41e4b79() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            interfaceC26059x88f1805a.mo36455xa41e4b79();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4400xc162a7c7
    /* renamed from: remove */
    public void mo37126xc84af884() {
        java.util.List list;
        if (this.f339179a != null) {
            synchronized (ey5.e.class) {
                ey5.r rVar = this.f339180b;
                if (rVar != null && (list = rVar.f339197f) != null) {
                    ((java.util.ArrayList) list).remove(this.f339179a);
                }
            }
            mo37245x63b3d9b2();
            this.f339179a.mo36414xc84af884();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: removeCollisionUnit */
    public void mo37246x63b3d9b2(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26062x676db5b8 interfaceC26062x676db5b8) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            interfaceC26059x88f1805a.mo36456x63b3d9b2(interfaceC26062x676db5b8);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: set2Top */
    public void mo37247x7640bf25() {
        ey5.r rVar = this.f339180b;
        if (rVar == null || rVar.f339197f == null) {
            return;
        }
        synchronized (ey5.e.class) {
            int size = ((java.util.ArrayList) this.f339180b.f339197f).size();
            java.util.Iterator it = ((java.util.ArrayList) this.f339180b.f339197f).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a) it.next();
                if (interfaceC26059x88f1805a.mo36420x397e976e() != Integer.MAX_VALUE && interfaceC26059x88f1805a.mo36420x397e976e() > size) {
                    size = interfaceC26059x88f1805a.mo36420x397e976e();
                }
            }
            this.f339179a.mo36429x2cb3cb7a(size < Integer.MAX_VALUE ? size + 1 : Integer.MAX_VALUE);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: setAlpha */
    public void mo37248x52b5721c(float f17) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            interfaceC26059x88f1805a.mo36457x52b5721c(f17);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: setAnchor */
    public void mo37249x40f19b7(float f17, float f18) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            interfaceC26059x88f1805a.mo36458x40f19b7(f17, f18);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: setCollisions */
    public void mo37250xbc4aa583(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25982xe7f56712... interfaceC25982xe7f56712Arr) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            interfaceC26059x88f1805a.mo36460xbc4aa583(interfaceC25982xe7f56712Arr);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: setContentDescription */
    public void mo37251x5e9e85c5(java.lang.String str) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            interfaceC26059x88f1805a.mo36461x5e9e85c5(str);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: setDraggable */
    public void mo37252x499b2f4b(boolean z17) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            interfaceC26059x88f1805a.mo36462x499b2f4b(z17);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: setGifIcon */
    public void mo37253xb2cd479b(android.graphics.Bitmap[] bitmapArr, boolean z17, int i17) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a == null || bitmapArr == null) {
            return;
        }
        interfaceC26059x88f1805a.mo36468xf28bea2c(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26011x93ded50c.m99338xfd7da21a(bitmapArr), z17, i17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: setIcon */
    public void mo37254x764b6bfb(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e c4392x4177761e) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a == null || c4392x4177761e == null) {
            return;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99335x63040d79 = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26011x93ded50c.m99335x63040d79(c4392x4177761e.m37085x12501425());
        m99335x63040d79.m99321x981c205a().mo36727x53aeca08(2);
        interfaceC26059x88f1805a.mo36467x764b6bfb(m99335x63040d79);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: setInfoWindowHideAnimation */
    public void mo37255x56304802(android.view.animation.Animation animation) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: setInfoWindowOffset */
    public void mo37256x95d998f3(int i17, int i18) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            interfaceC26059x88f1805a.mo36471x95d998f3(i17, i18);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: setInfoWindowShowAnimation */
    public void mo37257x211d8ca7(android.view.animation.Animation animation) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: setLevel */
    public void mo37258x534d5c42(int i17) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            interfaceC26059x88f1805a.mo35536x534d5c42(i17);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: setMarkerView */
    public void mo37259x5ee19c01(android.view.View view) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            interfaceC26059x88f1805a.mo36467x764b6bfb(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26011x93ded50c.m99345xb5d0e16f(view));
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: setPosition */
    public void mo37260xa32537ab(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            interfaceC26059x88f1805a.mo36473xa32537ab(ey5.x.f(c4406x873d1d26));
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: setRotation */
    public void mo37261x742bae00(float f17) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            interfaceC26059x88f1805a.mo36474x742bae00(f17);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: setSnippet */
    public void mo37262x365c7a5b(java.lang.String str) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            interfaceC26059x88f1805a.mo36476x365c7a5b(str);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: setTag */
    public void mo37263xca0297d8(java.lang.Object obj) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            interfaceC26059x88f1805a.mo36406xca0297d8(obj);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: setTitle */
    public void mo37264x53bfe316(java.lang.String str) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            interfaceC26059x88f1805a.mo36479x53bfe316(str);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4400xc162a7c7
    /* renamed from: setVisible */
    public void mo37134xcd1079b0(boolean z17) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            interfaceC26059x88f1805a.mo36427xcd1079b0(z17);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: setZIndex */
    public void mo37265x2cb3cb7a(float f17) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            interfaceC26059x88f1805a.mo36428x2cb3cb7a(f17);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: showInfoWindow */
    public void mo37266x3487511b() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            interfaceC26059x88f1805a.mo36480x3487511b();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: addCollisionUnit */
    public void mo37228x5ead30b5() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a != null) {
            this.f339181c = interfaceC26059x88f1805a.mo36430x5ead30b5(interfaceC26059x88f1805a.mo36439xf353c268());
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a
    /* renamed from: removeCollisionUnit */
    public void mo37245x63b3d9b2() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26062x676db5b8 interfaceC26062x676db5b8;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f339179a;
        if (interfaceC26059x88f1805a == null || (interfaceC26062x676db5b8 = this.f339181c) == null) {
            return;
        }
        interfaceC26059x88f1805a.mo36456x63b3d9b2(interfaceC26062x676db5b8);
    }
}
