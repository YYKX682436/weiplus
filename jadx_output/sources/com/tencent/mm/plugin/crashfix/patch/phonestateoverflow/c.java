package com.tencent.mm.plugin.crashfix.patch.phonestateoverflow;

/* loaded from: classes13.dex */
public class c extends android.telephony.PhoneStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.b f96679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.e f96680b;

    public c(com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.e eVar, com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.b bVar) {
        this.f96680b = eVar;
        this.f96679a = bVar;
    }

    @Override // android.telephony.PhoneStateListener
    public void onCallForwardingIndicatorChanged(boolean z17) {
        android.telephony.PhoneStateListener phoneStateListener;
        super.onCallForwardingIndicatorChanged(z17);
        synchronized (this.f96680b) {
            java.util.Iterator it = ((java.util.ArrayList) this.f96680b.f96683a).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d dVar = (com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d) it.next();
                if (dVar.f96681a == this.f96679a.f96677a && (phoneStateListener = (android.telephony.PhoneStateListener) dVar.f96682b.get()) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PhoneStateOverflow", "onCallForwardingIndicatorChanged %d %d", java.lang.Integer.valueOf(this.f96679a.f96677a), java.lang.Integer.valueOf(phoneStateListener.hashCode()));
                    phoneStateListener.onCallForwardingIndicatorChanged(z17);
                }
            }
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onCallStateChanged(int i17, java.lang.String str) {
        android.telephony.PhoneStateListener phoneStateListener;
        super.onCallStateChanged(i17, str);
        synchronized (this.f96680b) {
            java.util.Iterator it = ((java.util.ArrayList) this.f96680b.f96683a).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d dVar = (com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d) it.next();
                if (dVar.f96681a == this.f96679a.f96677a && (phoneStateListener = (android.telephony.PhoneStateListener) dVar.f96682b.get()) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PhoneStateOverflow", "onCallStateChanged %d %d", java.lang.Integer.valueOf(this.f96679a.f96677a), java.lang.Integer.valueOf(phoneStateListener.hashCode()));
                    phoneStateListener.onCallStateChanged(i17, str);
                }
            }
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onCellInfoChanged(java.util.List list) {
        android.telephony.PhoneStateListener phoneStateListener;
        super.onCellInfoChanged(list);
        synchronized (this.f96680b) {
            java.util.Iterator it = ((java.util.ArrayList) this.f96680b.f96683a).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d dVar = (com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d) it.next();
                if (dVar.f96681a == this.f96679a.f96677a && (phoneStateListener = (android.telephony.PhoneStateListener) dVar.f96682b.get()) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PhoneStateOverflow", "onCellInfoChanged %d %d", java.lang.Integer.valueOf(this.f96679a.f96677a), java.lang.Integer.valueOf(phoneStateListener.hashCode()));
                    phoneStateListener.onCellInfoChanged(list);
                }
            }
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onCellLocationChanged(android.telephony.CellLocation cellLocation) {
        android.telephony.PhoneStateListener phoneStateListener;
        super.onCellLocationChanged(cellLocation);
        synchronized (this.f96680b) {
            java.util.Iterator it = ((java.util.ArrayList) this.f96680b.f96683a).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d dVar = (com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d) it.next();
                if (dVar.f96681a == this.f96679a.f96677a && (phoneStateListener = (android.telephony.PhoneStateListener) dVar.f96682b.get()) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PhoneStateOverflow", "onCellLocationChanged %d %d", java.lang.Integer.valueOf(this.f96679a.f96677a), java.lang.Integer.valueOf(phoneStateListener.hashCode()));
                    phoneStateListener.onCellLocationChanged(cellLocation);
                }
            }
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onDataActivity(int i17) {
        android.telephony.PhoneStateListener phoneStateListener;
        super.onDataActivity(i17);
        synchronized (this.f96680b) {
            java.util.Iterator it = ((java.util.ArrayList) this.f96680b.f96683a).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d dVar = (com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d) it.next();
                if (dVar.f96681a == this.f96679a.f96677a && (phoneStateListener = (android.telephony.PhoneStateListener) dVar.f96682b.get()) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PhoneStateOverflow", "onDataActivity %d %d", java.lang.Integer.valueOf(this.f96679a.f96677a), java.lang.Integer.valueOf(phoneStateListener.hashCode()));
                    phoneStateListener.onDataActivity(i17);
                }
            }
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onDataConnectionStateChanged(int i17) {
        android.telephony.PhoneStateListener phoneStateListener;
        super.onDataConnectionStateChanged(i17);
        synchronized (this.f96680b) {
            java.util.Iterator it = ((java.util.ArrayList) this.f96680b.f96683a).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d dVar = (com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d) it.next();
                if (dVar.f96681a == this.f96679a.f96677a && (phoneStateListener = (android.telephony.PhoneStateListener) dVar.f96682b.get()) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PhoneStateOverflow", "onDataConnectionStateChanged %d %d", java.lang.Integer.valueOf(this.f96679a.f96677a), java.lang.Integer.valueOf(phoneStateListener.hashCode()));
                    phoneStateListener.onDataConnectionStateChanged(i17);
                }
            }
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onMessageWaitingIndicatorChanged(boolean z17) {
        android.telephony.PhoneStateListener phoneStateListener;
        super.onMessageWaitingIndicatorChanged(z17);
        synchronized (this.f96680b) {
            java.util.Iterator it = ((java.util.ArrayList) this.f96680b.f96683a).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d dVar = (com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d) it.next();
                if (dVar.f96681a == this.f96679a.f96677a && (phoneStateListener = (android.telephony.PhoneStateListener) dVar.f96682b.get()) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PhoneStateOverflow", "onMessageWaitingIndicatorChanged %d %d", java.lang.Integer.valueOf(this.f96679a.f96677a), java.lang.Integer.valueOf(phoneStateListener.hashCode()));
                    phoneStateListener.onMessageWaitingIndicatorChanged(z17);
                }
            }
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onServiceStateChanged(android.telephony.ServiceState serviceState) {
        android.telephony.PhoneStateListener phoneStateListener;
        super.onServiceStateChanged(serviceState);
        synchronized (this.f96680b) {
            java.util.Iterator it = ((java.util.ArrayList) this.f96680b.f96683a).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d dVar = (com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d) it.next();
                if (dVar.f96681a == this.f96679a.f96677a && (phoneStateListener = (android.telephony.PhoneStateListener) dVar.f96682b.get()) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PhoneStateOverflow", "onServiceStateChanged %d %d", java.lang.Integer.valueOf(this.f96679a.f96677a), java.lang.Integer.valueOf(phoneStateListener.hashCode()));
                    phoneStateListener.onServiceStateChanged(serviceState);
                }
            }
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onSignalStrengthChanged(int i17) {
        android.telephony.PhoneStateListener phoneStateListener;
        super.onSignalStrengthChanged(i17);
        com.tencent.mars.xlog.Log.e("MicroMsg.PhoneStateOverflow", "onSignalStrengthChanged call!, val = " + i17);
        synchronized (this.f96680b) {
            java.util.Iterator it = ((java.util.ArrayList) this.f96680b.f96683a).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d dVar = (com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d) it.next();
                if (dVar.f96681a == this.f96679a.f96677a && (phoneStateListener = (android.telephony.PhoneStateListener) dVar.f96682b.get()) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PhoneStateOverflow", "onSignalStrengthChanged %d %d", java.lang.Integer.valueOf(this.f96679a.f96677a), java.lang.Integer.valueOf(phoneStateListener.hashCode()));
                    phoneStateListener.onSignalStrengthChanged(i17);
                }
            }
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onSignalStrengthsChanged(android.telephony.SignalStrength signalStrength) {
        android.telephony.PhoneStateListener phoneStateListener;
        super.onSignalStrengthsChanged(signalStrength);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSignalStrengthsChanged call!, val = ");
        ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
        sb6.append(mm.l.c() ? signalStrength.toString() : "\\");
        com.tencent.mars.xlog.Log.e("MicroMsg.PhoneStateOverflow", sb6.toString());
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            java.util.List<android.telephony.CellSignalStrength> cellSignalStrengths = signalStrength.getCellSignalStrengths();
            java.util.HashMap hashMap = new java.util.HashMap(cellSignalStrengths.size());
            for (android.telephony.CellSignalStrength cellSignalStrength : cellSignalStrengths) {
                hashMap.put(cellSignalStrength.getClass(), cellSignalStrength);
            }
            android.telephony.CellSignalStrength cellSignalStrength2 = (android.telephony.CellSignalStrength) hashMap.get(android.telephony.CellSignalStrengthCdma.class);
            android.telephony.CellSignalStrength cellSignalStrength3 = (android.telephony.CellSignalStrength) hashMap.get(android.telephony.CellSignalStrengthGsm.class);
            android.telephony.CellSignalStrength cellSignalStrength4 = (android.telephony.CellSignalStrength) hashMap.get(android.telephony.CellSignalStrengthWcdma.class);
            android.telephony.CellSignalStrength cellSignalStrength5 = (android.telephony.CellSignalStrength) hashMap.get(android.telephony.CellSignalStrengthTdscdma.class);
            android.telephony.CellSignalStrength cellSignalStrength6 = (android.telephony.CellSignalStrength) hashMap.get(android.telephony.CellSignalStrengthLte.class);
            android.telephony.CellSignalStrength cellSignalStrength7 = (android.telephony.CellSignalStrength) hashMap.get(android.telephony.CellSignalStrengthNr.class);
            java.util.ArrayList arrayList = new java.util.ArrayList(6);
            arrayList.add(java.lang.Integer.valueOf(cellSignalStrength2 == null ? 0 : cellSignalStrength2.getLevel()));
            arrayList.add(java.lang.Integer.valueOf(cellSignalStrength3 == null ? 0 : cellSignalStrength3.getLevel()));
            arrayList.add(java.lang.Integer.valueOf(cellSignalStrength4 == null ? 0 : cellSignalStrength4.getLevel()));
            arrayList.add(java.lang.Integer.valueOf(cellSignalStrength5 == null ? 0 : cellSignalStrength5.getLevel()));
            arrayList.add(java.lang.Integer.valueOf(cellSignalStrength6 == null ? 0 : cellSignalStrength6.getLevel()));
            arrayList.add(java.lang.Integer.valueOf(cellSignalStrength7 == null ? 0 : cellSignalStrength7.getLevel()));
            com.tencent.mars.xlog.Log.i("MicroMsg.PhoneStateOverflow", "signalStrength: " + arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(6);
            arrayList2.add(java.lang.Integer.valueOf(cellSignalStrength2 == null ? 0 : cellSignalStrength2.getAsuLevel()));
            arrayList2.add(java.lang.Integer.valueOf(cellSignalStrength3 == null ? 0 : cellSignalStrength3.getAsuLevel()));
            arrayList2.add(java.lang.Integer.valueOf(cellSignalStrength4 == null ? 0 : cellSignalStrength4.getAsuLevel()));
            arrayList2.add(java.lang.Integer.valueOf(cellSignalStrength5 == null ? 0 : cellSignalStrength5.getAsuLevel()));
            arrayList2.add(java.lang.Integer.valueOf(cellSignalStrength6 == null ? 0 : cellSignalStrength6.getAsuLevel()));
            arrayList2.add(java.lang.Integer.valueOf(cellSignalStrength7 == null ? 0 : cellSignalStrength7.getAsuLevel()));
            com.tencent.mars.xlog.Log.i("MicroMsg.PhoneStateOverflow", "signalAsuLevel: " + arrayList2);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(6);
            arrayList3.add(java.lang.Integer.valueOf(cellSignalStrength2 == null ? 0 : cellSignalStrength2.getDbm()));
            arrayList3.add(java.lang.Integer.valueOf(cellSignalStrength3 == null ? 0 : cellSignalStrength3.getDbm()));
            arrayList3.add(java.lang.Integer.valueOf(cellSignalStrength4 == null ? 0 : cellSignalStrength4.getDbm()));
            arrayList3.add(java.lang.Integer.valueOf(cellSignalStrength5 == null ? 0 : cellSignalStrength5.getDbm()));
            arrayList3.add(java.lang.Integer.valueOf(cellSignalStrength6 == null ? 0 : cellSignalStrength6.getDbm()));
            arrayList3.add(java.lang.Integer.valueOf(cellSignalStrength7 == null ? 0 : cellSignalStrength7.getDbm()));
            com.tencent.mars.xlog.Log.i("MicroMsg.PhoneStateOverflow", "signalDbm: " + arrayList3);
        }
        synchronized (this.f96680b) {
            java.util.Iterator it = ((java.util.ArrayList) this.f96680b.f96683a).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d dVar = (com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d) it.next();
                if (dVar.f96681a == this.f96679a.f96677a && (phoneStateListener = (android.telephony.PhoneStateListener) dVar.f96682b.get()) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PhoneStateOverflow", "onSignalStrengthsChanged %d %d", java.lang.Integer.valueOf(this.f96679a.f96677a), java.lang.Integer.valueOf(phoneStateListener.hashCode()));
                    phoneStateListener.onSignalStrengthsChanged(signalStrength);
                }
            }
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onUserMobileDataStateChanged(boolean z17) {
        android.telephony.PhoneStateListener phoneStateListener;
        super.onUserMobileDataStateChanged(z17);
        synchronized (this.f96680b) {
            java.util.Iterator it = ((java.util.ArrayList) this.f96680b.f96683a).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d dVar = (com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d) it.next();
                if (dVar.f96681a == this.f96679a.f96677a && (phoneStateListener = (android.telephony.PhoneStateListener) dVar.f96682b.get()) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PhoneStateOverflow", "onUserMobileDataStateChanged %d %d", java.lang.Integer.valueOf(this.f96679a.f96677a), java.lang.Integer.valueOf(phoneStateListener.hashCode()));
                    phoneStateListener.onUserMobileDataStateChanged(z17);
                }
            }
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onDataConnectionStateChanged(int i17, int i18) {
        android.telephony.PhoneStateListener phoneStateListener;
        super.onDataConnectionStateChanged(i17, i18);
        synchronized (this.f96680b) {
            java.util.Iterator it = ((java.util.ArrayList) this.f96680b.f96683a).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d dVar = (com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d) it.next();
                if (dVar.f96681a == this.f96679a.f96677a && (phoneStateListener = (android.telephony.PhoneStateListener) dVar.f96682b.get()) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PhoneStateOverflow", "onDataConnectionStateChanged2 %d %d", java.lang.Integer.valueOf(this.f96679a.f96677a), java.lang.Integer.valueOf(phoneStateListener.hashCode()));
                    phoneStateListener.onDataConnectionStateChanged(i17, i18);
                }
            }
        }
    }
}
